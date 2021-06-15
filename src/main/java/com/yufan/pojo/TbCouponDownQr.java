package com.yufan.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/6/15
 */
@Entity
@Table(name = "tb_coupon_down_qr", schema = "store_db", catalog = "")
public class TbCouponDownQr {
    private int id;
    private int couponId;
    private String couponName;
    private String title;
    private String couponImg;
    private String intro;
    private Integer classifyId;
    private Integer couponType;
    private Integer leve1Id;
    private String couponValue;
    private Integer shopId;
    private String qrDesc;
    private Integer getType;
    private BigDecimal couponPrice;
    private String needKnow;
    private Integer appointType;
    private Timestamp changeOutDate;
    private Timestamp changeDate;
    private Integer userId;
    private Integer channelId;
    private String qrImg;
    private String changeCode;
    private String checkCode;
    private String content;
    private Timestamp qrCodeOuttime;
    private Integer recodeState;
    private Integer changeUserId;
    private Integer changePartnersId;
    private String createman;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
    private Integer status;
    private String remark;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "coupon_id", nullable = false)
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    @Basic
    @Column(name = "coupon_name", nullable = true, length = 50)
    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "coupon_img", nullable = true, length = 100)
    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    @Basic
    @Column(name = "intro", nullable = true, length = 255)
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Basic
    @Column(name = "classify_id", nullable = true)
    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    @Basic
    @Column(name = "coupon_type", nullable = true)
    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    @Basic
    @Column(name = "leve1_id", nullable = true)
    public Integer getLeve1Id() {
        return leve1Id;
    }

    public void setLeve1Id(Integer leve1Id) {
        this.leve1Id = leve1Id;
    }

    @Basic
    @Column(name = "coupon_value", nullable = true, length = 50)
    public String getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(String couponValue) {
        this.couponValue = couponValue;
    }

    @Basic
    @Column(name = "shop_id", nullable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "qr_desc", nullable = true, length = 255)
    public String getQrDesc() {
        return qrDesc;
    }

    public void setQrDesc(String qrDesc) {
        this.qrDesc = qrDesc;
    }

    @Basic
    @Column(name = "get_type", nullable = true)
    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    @Basic
    @Column(name = "coupon_price", nullable = true, precision = 2)
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    @Basic
    @Column(name = "need_know", nullable = true, length = 255)
    public String getNeedKnow() {
        return needKnow;
    }

    public void setNeedKnow(String needKnow) {
        this.needKnow = needKnow;
    }

    @Basic
    @Column(name = "appoint_type", nullable = true)
    public Integer getAppointType() {
        return appointType;
    }

    public void setAppointType(Integer appointType) {
        this.appointType = appointType;
    }

    @Basic
    @Column(name = "change_out_date", nullable = true)
    public Timestamp getChangeOutDate() {
        return changeOutDate;
    }

    public void setChangeOutDate(Timestamp changeOutDate) {
        this.changeOutDate = changeOutDate;
    }

    @Basic
    @Column(name = "change_date", nullable = true)
    public Timestamp getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Timestamp changeDate) {
        this.changeDate = changeDate;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "channel_id", nullable = true)
    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "qr_img", nullable = true, length = 200)
    public String getQrImg() {
        return qrImg;
    }

    public void setQrImg(String qrImg) {
        this.qrImg = qrImg;
    }

    @Basic
    @Column(name = "change_code", nullable = true, length = 200)
    public String getChangeCode() {
        return changeCode;
    }

    public void setChangeCode(String changeCode) {
        this.changeCode = changeCode;
    }

    @Basic
    @Column(name = "check_code", nullable = true, length = 20)
    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 200)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "qr_code_outtime", nullable = true)
    public Timestamp getQrCodeOuttime() {
        return qrCodeOuttime;
    }

    public void setQrCodeOuttime(Timestamp qrCodeOuttime) {
        this.qrCodeOuttime = qrCodeOuttime;
    }

    @Basic
    @Column(name = "recode_state", nullable = true)
    public Integer getRecodeState() {
        return recodeState;
    }

    public void setRecodeState(Integer recodeState) {
        this.recodeState = recodeState;
    }

    @Basic
    @Column(name = "change_user_id", nullable = true)
    public Integer getChangeUserId() {
        return changeUserId;
    }

    public void setChangeUserId(Integer changeUserId) {
        this.changeUserId = changeUserId;
    }

    @Basic
    @Column(name = "change_partners_id", nullable = true)
    public Integer getChangePartnersId() {
        return changePartnersId;
    }

    public void setChangePartnersId(Integer changePartnersId) {
        this.changePartnersId = changePartnersId;
    }

    @Basic
    @Column(name = "createman", nullable = true, length = 100)
    public String getCreateman() {
        return createman;
    }

    public void setCreateman(String createman) {
        this.createman = createman;
    }

    @Basic
    @Column(name = "createtime", nullable = true)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "lastaltertime", nullable = true)
    public Timestamp getLastaltertime() {
        return lastaltertime;
    }

    public void setLastaltertime(Timestamp lastaltertime) {
        this.lastaltertime = lastaltertime;
    }

    @Basic
    @Column(name = "lastalterman", nullable = true, length = 100)
    public String getLastalterman() {
        return lastalterman;
    }

    public void setLastalterman(String lastalterman) {
        this.lastalterman = lastalterman;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 200)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbCouponDownQr that = (TbCouponDownQr) o;
        return id == that.id &&
                couponId == that.couponId &&
                Objects.equals(couponName, that.couponName) &&
                Objects.equals(title, that.title) &&
                Objects.equals(couponImg, that.couponImg) &&
                Objects.equals(intro, that.intro) &&
                Objects.equals(classifyId, that.classifyId) &&
                Objects.equals(couponType, that.couponType) &&
                Objects.equals(leve1Id, that.leve1Id) &&
                Objects.equals(couponValue, that.couponValue) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(qrDesc, that.qrDesc) &&
                Objects.equals(getType, that.getType) &&
                Objects.equals(couponPrice, that.couponPrice) &&
                Objects.equals(needKnow, that.needKnow) &&
                Objects.equals(appointType, that.appointType) &&
                Objects.equals(changeOutDate, that.changeOutDate) &&
                Objects.equals(changeDate, that.changeDate) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(qrImg, that.qrImg) &&
                Objects.equals(changeCode, that.changeCode) &&
                Objects.equals(checkCode, that.checkCode) &&
                Objects.equals(content, that.content) &&
                Objects.equals(qrCodeOuttime, that.qrCodeOuttime) &&
                Objects.equals(recodeState, that.recodeState) &&
                Objects.equals(changeUserId, that.changeUserId) &&
                Objects.equals(changePartnersId, that.changePartnersId) &&
                Objects.equals(createman, that.createman) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(lastaltertime, that.lastaltertime) &&
                Objects.equals(lastalterman, that.lastalterman) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponId, couponName, title, couponImg, intro, classifyId, couponType, leve1Id, couponValue, shopId, qrDesc, getType, couponPrice, needKnow, appointType, changeOutDate, changeDate, userId, channelId, qrImg, changeCode, checkCode, content, qrCodeOuttime, recodeState, changeUserId, changePartnersId, createman, createtime, lastaltertime, lastalterman, status, remark);
    }
}
