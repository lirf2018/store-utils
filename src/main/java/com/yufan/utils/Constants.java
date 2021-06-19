package com.yufan.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lirf
 * @time: 2021/5/9
 */
public class Constants {

    /**
     * 固定系统参数MD5
     */
    public static String RESET_ORER_PASSWD = "13418915218";
    public static String ADMINPASSWORD = "40999628e3b875dae36bb4867c5c1c5f";//系统管理员固定参数
    public static String SHOPVALIDITY = "2019-01-01";//店铺有有效截止日期
    public static String ACTIVITYDATE = "2019-03-01";//jar包有效日期（4个月必须更新一次jar,防止合作单方面终止）

    /**
     * 订单重置秘钥
     */
    public static String ORDER_RESET_KEY = "c4ca4238a0b923820dcc509a6f75849b";

    /**
     * 订单状态
     * //0	待付款
     * //1	已付款
     * //2	确认中
     * //3	已失败
     * //4	待发货
     * //5	待收货
     * //6	已完成
     * //7	已取消
     * //8	已删除
     * //9	退款中
     * //10	已退款
     * //11	处理中
     * //12	还货中
     * //13	已还货
     */
    public static int ORDER_STATUS_0 = 0;
    public static int ORDER_STATUS_1 = 1;
    public static int ORDER_STATUS_2 = 2;
    public static int ORDER_STATUS_3 = 3;
    public static int ORDER_STATUS_4 = 4;
    public static int ORDER_STATUS_5 = 5;
    public static int ORDER_STATUS_6 = 6;
    public static int ORDER_STATUS_7 = 7;
    public static int ORDER_STATUS_8 = 8;
    public static int ORDER_STATUS_9 = 9;
    public static int ORDER_STATUS_10 = 10;
    public static int ORDER_STATUS_11 = 11;
    public static int ORDER_STATUS_12 = 12;
    public static int ORDER_STATUS_13 = 13;

    /**
     * 数据状态
     */
    public static int DATA_STATUS_WX = 0;//无效
    public static int DATA_STATUS_YX = 1;//有效
    public static int DATA_STATUS_DJ = 2;//已冻结
    public static int DATA_STATUS_DELETE = 3;//已删除
    public static int DATA_STATUS_SHZ = 10;//10审核中

    /**
     * 图片访问路径
     */
    public static String IMG_WEB_URL = "";//在数据库参数配置


    /**
     * 关联图片
     */
    //0.商品图片1.卡券图片2.店铺图片3.建议图片
    public static int IMG_CLASSIFY_GOODS = 0;//商品图片
    public static int IMG_CLASSIFY_COUPON = 1;//卡券图片
    public static int IMG_CLASSIFY_SHOP = 2;//店铺图片
    public static int IMG_CLASSIFY_SUGGEST = 3;//投诉建议图片

    //1:商品banner 2:商品图片介绍 3:店铺banner 4:店铺介绍图片 5:卡券banner 6:卡券介绍图片7投诉建议图片
    public static int IMG_TYPE_GOODS_BANNER = 1;//
    public static int IMG_TYPE_GOODS_INFO = 2;//
    public static int IMG_TYPE_SHOP_BANNER = 3;//
    public static int IMG_TYPE_SHOP_INFO = 4;//
    public static int IMG_TYPE_COUPON_BANNER = 5;//
    public static int IMG_TYPE_COUPON_INFO = 6;//
    public static int IMG_TYPE_7 = 7;//


    /**
     * 参数paramCode
     */
    public static String PARAM_CODE_LIMIT_WAY = "limit_way";//限购方式

    //1.每天一次2每月一次3.每年一次4不限购5只允许购买一次
    public static int LIMIT_WAY_1 = 1;
    public static int LIMIT_WAY_2 = 2;
    public static int LIMIT_WAY_3 = 3;
    public static int LIMIT_WAY_4 = 4;
    public static int LIMIT_WAY_5 = 5;

    /**
     * 网易短信参数
     */
    public static String APP_SECRET_WY = "";
    public static String APP_KEY_WY = "";
    public static String SENDTEMPLATE_URL_WY = "";
    public static String SENDCODE_URL_WY = "";

    /**
     * 阿里云
     */
    public static String ACCESSKEYID_ALIPAY = "";
    public static String ACCESSKEYSECRET_ALIPAY = "";


    /**
     * 验证码类型:1手机绑定2修改密码3重置密码4手机解绑5手机注册6验证码登录7注销账号
     */
    public static int VALID_TYPE_1 = 1;
    public static int VALID_TYPE_2 = 2;
    public static int VALID_TYPE_3 = 3;
    public static int VALID_TYPE_4 = 4;
    public static int VALID_TYPE_5 = 5;
    public static int VALID_TYPE_6 = 6;
    public static int VALID_TYPE_7 = 7;


    /**
     * 用户状态   0待验证 1正常 2锁定 3已注销
     */
    public static int USER_STATUS_0 = 0;
    public static int USER_STATUS_1 = 1;
    public static int USER_STATUS_2 = 2;
    public static int USER_STATUS_3 = 3;


    /**
     * 用户sns  状态0无效1有效2已解绑
     */
    public static int USER_SNS_STATUS_0 = 0;
    public static int USER_SNS_STATUS_1 = 1;
    public static int USER_SNS_STATUS_2 = 2;

    /**
     * 用户snsType   1、腾讯微博；2、新浪微博；3、人人网；4、微信；5、服务窗；6、一起沃；7、QQ;8、绑定会员号；9、绑定手机号
     */
    public static int USER_SNS_TYPE_0 = 0;
    public static int USER_SNS_TYPE_1 = 1;
    public static int USER_SNS_TYPE_2 = 2;
    public static int USER_SNS_TYPE_3 = 3;
    public static int USER_SNS_TYPE_4 = 4;
    public static int USER_SNS_TYPE_5 = 5;
    public static int USER_SNS_TYPE_6 = 6;
    public static int USER_SNS_TYPE_7 = 7;
    public static int USER_SNS_TYPE_8 = 8;
    public static int USER_SNS_TYPE_9 = 9;


    //交易方式 0现金付款1微信2支付宝3账户余额
    public static int PAY_WAY_0 = 0;
    public static int PAY_WAY_1 = 1;
    public static int PAY_WAY_2 = 2;
    public static int PAY_WAY_3 = 3;


    /**
     * 取货方式 收货方式 1.邮寄4.自取5配送 postWay
     */
    public static int POST_WAY_1 = 1;
    public static int POST_WAY_2 = 2;
    public static int POST_WAY_3 = 3;


    /**
     * 支付结果
     */
    public static int PAY_STATUS = 1;//成功


    /**
     * kc 生成序列号类型 1:入库商品店铺号
     */
    public static int GENERATE_TYPE = 1;//

    /**
     * 店铺号前缀
     */
    public static String SHOP_CODE_MARK = "";

    /**
     * 控制生成唯一订单
     */
    // String uniqueKey = data.getString("unique_key");
    public static Map<String, String> ORDER_NO_KEY_MAP = new HashMap<>();

    /**
     * 支付方式 0现金付款1微信2支付宝3账户余额
     */
    public static int PAY_TYPE_0 = 0;
    public static int PAY_TYPE_1 = 1;
    public static int PAY_TYPE_2 = 2;
    public static int PAY_TYPE_3 = 3;

    /**
     * 季度
     */
    public static String JIDU_1 = "1";
    public static String JIDU_2 = "2";
    public static String JIDU_3 = "3";
    public static String JIDU_4 = "4";

    //开单页面扫码添加商品防止重复提交
    public static Map<String, Long> MAP_GOODS_CODE_LOCK = new HashMap<>();

    /**
     * 查询数量
     */
    public static int SEARCH_COUNT_1 = 1;
    public static int SEARCH_COUNT_4 = 4;
    public static int SEARCH_COUNT_6 = 6;
    public static int SEARCH_COUNT_8 = 8;
    public static int SEARCH_COUNT_10 = 10;
    public static int SEARCH_COUNT_12 = 12;

    /**
     * 0main页 1分类页面
     */
    public static int MENU_TYPE_0 = 0;
    public static int MENU_TYPE_1 = 1;

    /**
     * 用于分类页面的关联类型 1关联一级分类 2 关联2级分类
     */
    public static int MENU_REL__TYPE_1 = 1;
    public static int MENU_REL_TYPE_2 = 2;


    /**
     * 图片本地保存根路径 E:\img
     */
    public static String IMG_SAVE_ROOT_PATH = "";

    /**
     * 默认关单时间/分
     */
    public static int DEFAULT_CLOSE_TIME = 15;

    /**
     * 登录token过期时间/分钟
     */
    public static int LOGIN_TOKEN_PASS_TIME = 30;

    public static Map<String, String> MAP_NAME = new HashMap<>();

    static {
        MAP_NAME.put("payType0", "现金");
        MAP_NAME.put("payType1", "微信");
        MAP_NAME.put("payType2", "支付宝");
        MAP_NAME.put("payType3", "账户余额");
        MAP_NAME.put("orderStatus0", "待付款");
        MAP_NAME.put("orderStatus1", "已付款");
        MAP_NAME.put("orderStatus3", "已失败");
        MAP_NAME.put("orderStatus4", "待发货");
        MAP_NAME.put("orderStatus5", "待收货");
        MAP_NAME.put("orderStatus6", "已完成");
        MAP_NAME.put("orderStatus7", "已取消");
        MAP_NAME.put("orderStatus8", "已删除");
        MAP_NAME.put("orderStatus9", "退款中");
        MAP_NAME.put("orderStatus10", "已退款");
        MAP_NAME.put("orderStatus11", "处理中");
        MAP_NAME.put("orderStatus12", "还货中");
        MAP_NAME.put("orderStatus13", "已还货");

        // valid_type 手机验证码类型 1手机绑定2修改密码3重置密码4手机解绑5手机注册6手机注册/登录
        MAP_NAME.put("phoneValidType1", VALID_TYPE_1 + "");
        MAP_NAME.put("phoneValidType2", VALID_TYPE_2 + "");
        MAP_NAME.put("phoneValidType3", VALID_TYPE_3 + "");
        MAP_NAME.put("phoneValidType4", VALID_TYPE_4 + "");
        MAP_NAME.put("phoneValidType5", VALID_TYPE_5 + "");
        MAP_NAME.put("phoneValidType6", VALID_TYPE_6 + "");
        MAP_NAME.put("phoneValidType7", VALID_TYPE_7 + "");
    }

    /**
     * 业务类型
     */
    public static String BUSINESS_TYPE_1 = "change_qr_code";// 优惠券兑换

}
