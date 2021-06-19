package com.yufan.bean;

import com.alibaba.fastjson.JSONObject;
import com.yufan.utils.HelpCommon;

/**
 * @description:
 * @author: lirf
 * @time: 2021/6/19
 */
public class RequestData {

    /**
     * 请求对象
     */
    private String reqType;

    /**
     * 应用ID
     */
    private String sid;

    /**
     * 应用ID秘钥
     */
    private String appsecret;

    /**
     * 数据
     */
    private JSONObject data;

    private RequestData() {

    }

    public RequestData(String reqType, String sid, String appsecret, JSONObject data) {
        this.reqType = reqType;
        this.sid = sid;
        this.appsecret = appsecret;
        this.data = data;
    }


    public JSONObject requestParam() {
        long timestamp = System.currentTimeMillis()/1000;
        JSONObject param = new JSONObject();
        param.put("req_type", reqType);
        param.put("timestamp", timestamp);
        param.put("data", data);
        String sign = HelpCommon.generateSign(appsecret, timestamp, data);
        param.put("sign", sign);
        param.put("sid", sid);
        return param;
    }
}
