package com.yufan.utils;

public enum ResultCode {
    FAIL_1(0, "操作失败,请联系管理员处理"),
    //    SUCCESS(1, "操作成功"),
    DELETE_FAIL(2, "删除失败"),
    DELETE_SUCCESS(3, "删除成功"),
    USE_SUCCESS(4, "启用成功"),
    UPDATE_SUCCESS(5, "修改成功"),
    ADD_SUCCESS(6, "增加成功"),
    SAVE_FAIL(7, "保存失败"),
    LOGIN_FAIL(8, "登录失败"),
    LOGIN_SUCCESS(9, "登录成功"),
    ACCOUNT_OR_PASSWD_FAIL(10, "账号或者密码有误"),
    ERROR_PASSWD_KEY(11, "秘钥有误"),
    UPLOAD_SUCCESS(12, "上传成功"),
    UPLOAD_FAIL(13, "上传失败"),
    UPLOAD_ERROR_FAIL(14, "上传异常"),
    CODE_REPEAT(15, "编码已存在"),
    OLD_PASSWD_ERROR(16, "旧密码不正确"),
    IS_DEAL_WITH(17, "已处理"),
    IS_NOT_DEAL_WITH(18, "未处理"),
    IS_ON_SELL(19, "下架成功"),
    IS_NOT_ON_SELL(20, "上架成功"),
    CACEL_SUCCESS(21, "取消成功"),
    SETTING_SUCCESS(22, "设置成功"),
    FILE_OUT_SIZE(23, "文件大小超出规定大小"),
    DATA_EXIST(24, "数据{}已存在"),
    QR_NOT_EXIST(25, "QR码不存在"),
    QRCHECK_NOT_EXIST(26, "QR校验码不正正确"),
    QRCODE_ISBEAN_USE(27, "QR码已兑换，不能重复兑换"),
    QRCODE_CHANGE_OUT_TIME(28, "QR码已超时,请用客户端重新刷新QR码"),
    QRCODE_OUT_TIME(29, "QR码已过期失效，不能兑换"),
    GOODS_EXCEPTION_01(30, "查询类目属性值数据异常"),
    GOODS_EXCEPTION_02(31, "sku数据异常"),
    ODE_CANTUSE_TIME(32, "QR码当前日期不可用"),
    INF_ACCOUNT_NOT_EXIST(33, "接口账号不存在"),
    OK(1, "成功"),
    FAIL(-1, "网络异常,请稍后重试"),
    PASS(-2, ""),
    INFO_ERROR(1000, "接口不存在"),
    SYS_ERROR(1001, "系统错误，请稍后重试"),
    PARAM_ERROR(1002, "参数格式不正确"),
    PARAM_FORMAT_ERROR(1003, "参数解析失败"),
    ACCESS_TOKEN_INVALID(1004, "令牌无效"),
    INTERFACE_CALL_FAIL(1005, "接口调用失败"),
    OUT_OF_TIME(1006, "接口调用超时"),
    ERROR_SIGN(1007, "签名不正确"),
    ERROR_USER_BANGWEIXIN(1008, "绑定微信才能使用短信服务"),
    ERROR_USER_ISBANGWEIXIN(1009, "微信已被绑定"),
    ERROR_SMS(10010, "短信发送上限"),
    NEED_PARAM_ERROR(10011, "缺少必要参数"),
    STORE_EMPTY(10012, "商品库存不足"),
    FAIL_GET_TICKET(10013, "领取失败,请查看卡券领取限制规则"),
    FAIL_REGISTER(10014, "注册失败"),
    CODE_NONEFFECTIVE(10015, "验证码无效"),
    FAIL_USER_EXIST(10016, "登录名称已存在"),
    FAIL_BOUND_PHONE(10017, "该号码已被注册,请更换其它号码重试"),
    GOODS_NOT_EXIST(10018, "商品不存在"),
    FULL_ORDER_CARD(10019, "购物车已满"),
    FAIL_ADD_CARD_LIMIT_GOODS(10020, "操作失败,请查看商品限购规则"),
    FAIL_USER_INVALIDATE(10021, "用户不存在"),
    FAIL_USER_LOCK(10022, "用户已锁定"),
    FAIL_USER_NEED_VERIFY(10023, "用户待验证"),
    LOGIN_NAME_CANNOT_NUM(10024, "登录名称不能是纯数字"),
    LOGIN_PHONE_NEED_VERIFY(10025, "登录手机待验证"),
    FAIL_NOTBANG_WEIXIN(10026, "账号未绑定微信"),
    FAIL_ADD_ORDERCARD(10027, "增加到购物车失败"),
    GOODSINFO_NOT_EXIST(10028, "商品数据有误"),
    GOODSINFO_MAX_OUT(10029, "商品种类数量超过上限"),
    ORDWE_PRICE_ERROR(10030, "订单价格计算有误"),
    ORDWE_COUNT_ERROR(10031, "订单数量计算有误"),
    DISCOUNT_ERROR(10032, "优惠全券无效"),
    ORDER_ALONE_ERROR(10033, "符合独立订单规则"),
    ORDER_LIMIT_ERROR(10034, "不符合限购规则,或者超出限购数,请认真查看限购规则后,重新下单"),
    FAIL_GOODS_INVALIDATE(10035, "商品无效"),
    GOODS_STORE_NOENOUGH(10036, "库存不足"),
    SMS_SEND_FAIL(10037, "短信发送失败"),
    OLD_PASSWD_EROOR(10038, "旧密码有误"),
    PHONE_HAS_USED(10039, "手机已经被使用,请更换其它手机号"),
    PASSWD_ERROR(10040, "密码或账号不正确"),
    BIND_ERROR(10041, "未绑定"),
    NET_ERROR(10042, "网络异常,请稍后重试"),
    PART_GOODS_OUTTIME_ERROR(10043, "部分商品已失效"),
    GOODS_PEISONG_ERROR(10044, "商品配送方式不一致"),
    ORDER_NOT_EXIST(10045, "订单不存在"),
    ERROR_WORD_QUESTION(10046, "密保问题有误"),
    ERROR_WORD_QUESTION_(10047, "密保问题不能相同"),
    BUSINESS_NOT_ERROR(10048, "验证码类型未开发"),
    ADDR_NOT_EXIST(10049, "收货地址无效"),
    GOODS_NOT_POST(10050, "商品不支持邮寄"),
    ORDER_NOT_POST(10051, "部分商品取货方式不支持 "),
    GOODS_CHECK_NOT_POST(10052, "商品取货方式不支持"),
    USER_ADDR_FULL(10053, "最多能保存10个有效收货地址"),
    GOODS_GETWAY_DIFF(10054, "商品取货方式不一致"),
    USER_PHONE_NOTUSE(10055, "手机未被绑定"),
    NOT_BOUND_WEIXIN(10056, "账号未绑定微信,不允许解绑"),
    NOT_BOUND_PHONE(10057, "账号未绑定手机号,不允许解绑"),
    PART_GOODS_STORE_NOENOUGH(10058, "部分商品库存不足"),
    QUERY_NOT_FIND(10059, "查询不存在"),
    OUT_TIME_FIND(10060, "不在活动时间范围内"),
    CHECK_FIND(10061, "校验失败"),
    PHONE_HAS_BANG(10062, "手机已经被绑定"),
    PHONE_ERROR(10063, "当前手机不允许发送验证码"),
    THE_SAME_GOODS_WARING(50001, "已存在相同条形码商品，请直接查询使用; 同一条形码的商品规格和规格数必须保持一致"),
    GOODS_IS_EXIST(50002, "商品已存在"),
    GOODS_NOT_SALE(50003, "商品已下架"),
    MEMBER_NOT_EXIST(50004, "会员不存在"),
    PRICE_ERROR(50005, "销售价格不能小于促销价格; 销售价格不能小于会员价格"),
    ORDER_SHOPCODE_EXIST(50006, "该店铺码商品已出库,请勿重复添加"),
    PRICE_ERROR2(50007, "非促销,销售价格必须等于促销价格"),
    GOODS_NOT_FIND(50008, "店铺码对应的商品不存在"),
    ORDER_IS_PAY(50009, "订单已付款,请重新开单"),
    PASS_FAIL_1(50010, "验证不通过"),
    ADD_TO_FAST(50011, "添加商品过快"),
    GOODS_OUTTIME_ERROR(10064, "商品已失效"),
    TIMEGOODS_OUTTIME_ERROR(10065, "商品抢购活动已结束"),
    TIMEGOODS_STORE_EMPTY(10066, "抢购商品库存不足"),
    LIMIT_GOODS_RULE(10067, "部分商品不满足限购规则"),
    GOODS_SKU_NEED(10068, "请选择商品规格"),
    USER_UNLOGIN(401, "用户未登录"),
    MEMBERNUM_IS_BANG(10069, "会员号已被绑定"),
    MEMBERNUM_NOT_EXIST(10070, "会员号不存在"),
    DATE_NOT_EXIST(10071, "当前日期不存在"),
    COUPON_NOT_EXIST(10072, "卡券已下架"),
    COUPONQR_IS_EXIST(10073, "请勿重复领取"),
    COUPONQR_QOWM_FAIL(10074, "超出限制领取数量"),
    LIMIT_COUPON_RULE(10075, "不满足领取规则"),
    ORDER_STATUS_CANTNOT(10076, "订单数据不存在或者订单状态不满足生成条件"),
    ORDER_CONDITION_UNCREATE(10077, "当前订单不满足生成条件");


    private int resp_code;
    private String resp_desc;

    private ResultCode(int resp_code, String resp_desc) {
        this.resp_code = resp_code;
        this.resp_desc = resp_desc;
    }

    /**
     * 获取编码
     *
     * @return
     */
    public int getResp_code() {
        return resp_code;
    }

    /**
     * 获取描述值
     *
     * @return
     */
    public String getResp_desc() {
        return resp_desc;
    }

    public static String getRespDesc(int resp_code) {
        String dt = "";
        for (ResultCode ac : ResultCode.values()) {
            if (ac.resp_code == resp_code) {
                dt = ac.getResp_desc();
                break;
            }
        }
        return dt;
    }


}
