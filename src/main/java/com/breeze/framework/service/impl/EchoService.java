package com.breeze.framework.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.breeze.framework.common.MargicNumberConstants;
import com.breeze.framework.common.MergeQuery;
import com.breeze.framework.entity.ContractCreate;
import com.breeze.framework.mapper.EchoMapper;
import com.breeze.framework.service.IEchoService;
import com.breeze.framework.thread.MyRunnable;

import freemarker.template.Configuration;
/**
 * @author JuanChensh
 *
 */
@Service
public class EchoService implements IEchoService {
    private static final Logger logger = LoggerFactory.getLogger(EchoService.class);
    @Value("${contract.url}")
    private String contractUrl;
    @Value("${internet.callbackUrl}")
    private String callbackUrl;
	@Autowired
	private EchoMapper echoMapper;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private Configuration configuration;
    
    //池中所保存的线程数，包括空闲线程。  
    final static int corePoolSize = 20;  
    //池中允许的最大线程数。  
    final static int maximumPoolSize = 30;  
    //当线程数大于核心线程时，此为终止前多余的空闲线程等待新任务的最长时间  
    final static long keepAliveTime = 200;  
    //执行前用于保持任务的队列30，即任务缓存队列  
    final static ArrayBlockingQueue<Runnable> workQueue =new ArrayBlockingQueue<Runnable>(30);

	@Override
	public Map<String, String> selectAll() {
        //构建一个线程池，正常线程数量为5，最大线程数据为10，等待时间200  
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(  
                corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MINUTES, workQueue);
        
		Map<String, String> resultMap = new HashMap<String, String>();
		Long total = echoMapper.selectAllCount();
		int pageSize = 1000;
		int totalPageCount = (int) this.getTotalPageCount(total, pageSize);
		//任务数
		int targetCount = 20;
		//每个线程处理的次数
		int perTargetCount = totalPageCount/targetCount;
		// 调用开始时间
//		long start = System.currentTimeMillis();
		//线程池去执行8个任务
		for (int i = 1; i <= targetCount; i++) {
			MergeQuery<ContractCreate> queryThread = new MergeQuery<ContractCreate>();
			queryThread.setPageSize(pageSize);
			if(i == targetCount){
				//每个任务执行1000条数据
				MyRunnable myRunnable = new MyRunnable((i-1)*perTargetCount,totalPageCount,restTemplate,configuration,contractUrl,callbackUrl,echoMapper,queryThread);  
				threadPoolExecutor.execute(myRunnable);  
			}else{
				//每个任务执行1000条数据
				MyRunnable myRunnable = new MyRunnable((i-1)*perTargetCount,i*perTargetCount,restTemplate,configuration,contractUrl,callbackUrl,echoMapper,queryThread);  
				threadPoolExecutor.execute(myRunnable);  
			}

		}
        //查看合同处理时间
//        long proTime = System.currentTimeMillis() - start;
//        logger.info("合同平台处理时间（毫秒）"+proTime);
		return resultMap;
	}
	/**
	 * @param total
	 * @param pageSize
	 * @return
	 * 查询次数
	 */
	private long getTotalPageCount(long total,long pageSize){
	   if (total % (long) pageSize == MargicNumberConstants.n0){
		   return total / (long) pageSize;
	   }else{
		   return total / (long) pageSize + MargicNumberConstants.n1;
	   }
	}
	/* (non-Javadoc)
	 * @see com.breeze.framework.service.IEchoService#selectAllTest()
	 */
	@Override
	public Map<String, String> selectAllTest() {
		for (int i = 1; i <= 1200000; i++) {
			
			
		}
		return null;
	}
}
