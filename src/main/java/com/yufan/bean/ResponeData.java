package com.yufan.bean;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @description:
 * @author: lirf
 * @time: 2021/6/19
 */
@Data
public class ResponeData {
    @JSONField(name = "resp_code")
    private int respCode;

    @JSONField(name = "resp_desc")
    private String respDesc;

    @JSONField(name = "data")
    private JSONObject data;
}
