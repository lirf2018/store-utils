package com.yufan.checkenum;

import com.alibaba.fastjson.JSONObject;

/**
 * @description:
 * @author: lirf
 * @time: 2021/8/24
 */
public class TestMain {

    public static void main(String[] args) {

        String key = "TEST_KEY1";
        String value = "3";
        System.out.println(JSONObject.toJSON(VerifyRuleEnumImpl.valueOf(key).getCheckVerifyDataEnum().verifyData(key, value)));
    }
}
