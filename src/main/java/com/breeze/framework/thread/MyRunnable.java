/**
 * 
 */
package com.breeze.framework.thread;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.breeze.framework.common.Constant;
import com.breeze.framework.common.MergeQuery;
import com.breeze.framework.common.SystemUtil;
import com.breeze.framework.entity.ContractCreate;
import com.breeze.framework.entity.InternetUse;
import com.breeze.framework.mapper.EchoMapper;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * @author JuanChensh
 *
 */
public class MyRunnable implements Runnable {
	
    private static final Logger logger = LoggerFactory.getLogger(MyRunnable.class);

    /**
     * 合同系统地址
     */

    // 正在执行的任务数  
    private RestTemplate restTemplate;
    private Configuration configuration;
    private String contractUrl;
    private String callbackUrl;
    private EchoMapper echoMapper;
    private int startThreadPage;
    private int endThreadPage;
    private MergeQuery<ContractCreate> queryThread;
    public MyRunnable(int startThreadPage,
			int endThreadPage,RestTemplate restTemplate,Configuration configuration
    		,String contractUrl,String callbackUrl,EchoMapper echoMapper,MergeQuery<ContractCreate> queryThread) { 
    	this.startThreadPage = startThreadPage;
    	this.endThreadPage = endThreadPage;
        this.restTemplate = restTemplate;
        this.configuration = configuration;
        this.callbackUrl = callbackUrl;
        this.contractUrl = contractUrl;
        this.echoMapper = echoMapper;
        this.queryThread = queryThread;
    }  
  
    @Override  
    public void run() {
		// 循环处理
		for (int i = (startThreadPage +1); i <= endThreadPage; i++) {
			queryThread.setCurrentPage(i);
			List<Map<String, Object>> result = echoMapper.selectAll(queryThread);
			for (Map<String, Object> map : result) {
				logger.info("the current thread name "+Thread.currentThread().getName());
				contractCreateTool(map); 
			}
			
		}	
    }
    public void contractCreateTool(Map<String, Object> map) {
       
    }
    public boolean  doExecute(String messageContent,String loanId, String contractId) {
    	boolean isSucess = true;
        
        return isSucess;
    }
  
} 