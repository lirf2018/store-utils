package com.yufan.testRedis;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lirf
 * @time: 2021/5/11
 */
public class LoginCache {

    //key = token,value=json{userId:'',userPhone:'',memberNum:'',tokenPassTime:12366}
    //key = userId,value=json{token:'',tokenPassTime:12366}
    /**
     * 用户模拟存放登录成功的信息，同时存在两种数据 tokenPassTime  时间搓
     */
    public static Map<String, JSONObject> loginMapsToken = new HashMap<>();
    public static Map<String, JSONObject> loginMapsUserId = new HashMap<>();

}
