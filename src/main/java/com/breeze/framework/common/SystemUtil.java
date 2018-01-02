/**
 * @Title: [SystemUtil.java]
 * @Package: [com.qf.paydayloan.bizapp.service]
 * @author: [LongshiWei]
 * @CreateDate: [2017/2/21 18:50]
 * @UpdateUser: [LongshiWei]
 * @UpdateDate: [2017/2/21 18:50]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [创建http请求]
 * @version: [V1.0]
 */
package com.breeze.framework.common;

import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * @author JuanChensh
 *
 */
public class SystemUtil {
    private static  final String DATE_FORMAT = "yyyyMMddHHmmss";
    private SystemUtil() {

    }

    /**
     * 默认请求头部信息
     *
     * @return
     */
    public static HttpHeaders defaultHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE);
        headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        return headers;
    }

    /**
     * 构建get请求参数
     *
     * @param uri
     * @param queryParams
     * @return
     */
    public static String getQuery(String uri, Map<String, String> queryParams) {
        if (!queryParams.isEmpty()) {
            StringBuilder queryBuilder = new StringBuilder();
            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
                String name = entry.getKey();
                String value = entry.getValue();
                if (queryBuilder.length() != 0) {
                    queryBuilder.append('&');
                }
                queryBuilder.append(name);
                if (entry.getValue() != null) {
                    queryBuilder.append('=');
                    queryBuilder.append(value);
                }
            }
            return uri + "?" + queryBuilder.toString();
        } else {
            return null;
        }
    }


    /**
     * 由年月日时分秒+4位随机数
     * 生成流水号
     *
     * @return
     */
//    public static synchronized String getSerialNo() {
//        Random random = new Random();
//        StringBuilder sb = new StringBuilder();
//        sb.append( FastDateFormat.getInstance(DATE_FORMAT).format(new Date()));
//        int n = random.nextInt(9000)+1000;
//        sb.append(n);
//        return sb.toString();
//    }

}
