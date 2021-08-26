package com.yufan.checkenum;

/**
 * @description:
 * @author: lirf
 * @time: 2021/8/24
 */
public enum VerifyRuleEnumImpl {

    TEST_KEY1("TEST_KEY", "000001", "只能是0到1", "0|1", VerifyConstants.ValueTypeClass.VALUE_TYPE_INT, CheckVerifyDataEnum.IN),
    ASU("ASU", "000002", "只能是5到6", "0|1", VerifyConstants.ValueTypeClass.VALUE_TYPE_INT, CheckVerifyDataEnum.IN);

    private String key;//校验关键key
    private String code;//编码
    private String errorMsg;//错误描述
    private String value; //检验规则
    private String valueType;//校验值数据类型
    private CheckVerifyDataEnum checkVerifyDataEnum;

    VerifyRuleEnumImpl(String key, String code, String errorMsg, String value, String valueType, CheckVerifyDataEnum checkVerifyDataEnum) {
        this.key = key;
        this.code = code;
        this.errorMsg = errorMsg;
        this.value = value;
        this.valueType = valueType;
        this.checkVerifyDataEnum = checkVerifyDataEnum;
    }

    public String getCode() {
        return code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getValue() {
        return value;
    }

    public CheckVerifyDataEnum getCheckVerifyDataEnum() {
        return checkVerifyDataEnum;
    }
}
