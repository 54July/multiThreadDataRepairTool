package com.breeze.framework.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * @author JuanChensh
 *
 */
public class Constant {

    /**
     * 证件类型
     */
    public static final Map<String, String> CERTTYPE_MAP;
    /**
     * 文件类型对应
     */
    public static final Map<String, String> FILE_TYPE_MAP = new HashMap<>();

    static {
        Map<String, String> certTypeMap = new HashMap<>();
        certTypeMap.put("Id1", "二代身份证");
        certTypeMap.put("Id2", "结婚证");
        certTypeMap.put("Id3", "户口本");
        certTypeMap.put("Id4", "军官证");
        certTypeMap.put("Id5", "护照");
        certTypeMap.put("Id6", "士兵证");
        certTypeMap.put("Id7", "港澳居民来往内地通行证");
        certTypeMap.put("Id8", "台湾同胞来往内地通行证");
        certTypeMap.put("Id9", "临时身份证");
        certTypeMap.put("Id10", "外国人居留证");
        certTypeMap.put("Id11", "警官证");
        certTypeMap.put("Id12", "其他证件");
        CERTTYPE_MAP = Collections.unmodifiableMap(certTypeMap);
        
        FILE_TYPE_MAP.put("1-借款协议", "2");
        FILE_TYPE_MAP.put("2-借款咨询与服务协议", "3");
        FILE_TYPE_MAP.put("3-委托划扣授权书", "4");
        FILE_TYPE_MAP.put("服务协议", "5");
        FILE_TYPE_MAP.put("暖薪贷用户注册协议", "6");
        FILE_TYPE_MAP.put("隐私政策及授权使用协议", "7");
        FILE_TYPE_MAP.put("电子签名数字证书申请及调用的授权委托书", "8");
    }

    /**
     * 缓存时间
     */
    public static final int EXPIRE_TIME = 4;

    /**
     * 异常重试缓存前缀
     */
    public static final String REDIS_EXP_PREFIX = "paydayloan.be.";
    /**
     * kafka异常重试缓存前缀
     */
    public static final String REDIS_KAFKA_PREFIX = "paydayloan.bizapp.kafka.loan.";

    /**
     * API类型（京东，运营商,准入，白骑士）
     */
    public enum ApiEnum {

        SYNC_BID("syncBid"),
        APPLY_CA("applyCa"),
        NDES_API("ndesApi");

        private String name;

        ApiEnum(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public enum Step {
        REQ,
        CALLBACK
    }

    /**
     * 模板文件名称
     */
    //生成合同请求模板
    public static final String TEMP_CONTRACT_CREATE_REQ = "contractCreateReq.json";
    
    /**
     * 默认请求头部信息
     *
     * @return
     */
    public static HttpHeaders defaultHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8");
        headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        return headers;
    }
}
