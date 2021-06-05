package com.yufan.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/5/16
 */
@Entity
@Table(name = "tb_coupon_down_qr", schema = "store_db", catalog = "")
public class TbCouponDownQr {
    private int id;
    private Integer couponId;
    private Integer userId;
    private Integer channelId;
    private String qrImg;
    private String changeCode;
    private String checkCode;
    private String content;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer recodeState;
    private Timestamp changeDate;
    private Integer changeUserId;
    private Integer changePartnersId;
    private String createman;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
    private Integer status;
    private String remark;
    private Integer couponType;
    private BigDecimal couponValue;
    private Integer shopId;
    private String qrDesc;

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
    @Column(name = "coupon_id", nullable = true)
    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
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
    @Column(name = "start_time", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
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
    @Column(name = "change_date", nullable = true)
    public Timestamp getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Timestamp changeDate) {
        this.changeDate = changeDate;
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

    @Basic
    @Column(name = "coupon_type", nullable = true)
    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    @Basic
    @Column(name = "coupon_value", nullable = true, precision = 2)
    public BigDecimal getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(BigDecimal couponValue) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbCouponDownQr that = (TbCouponDownQr) o;
        return id == that.id &&
                Objects.equals(couponId, that.couponId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(qrImg, that.qrImg) &&
                Objects.equals(changeCode, that.changeCode) &&
                Objects.equals(checkCode, that.checkCode) &&
                Objects.equals(content, that.content) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(recodeState, that.recodeState) &&
                Objects.equals(changeDate, that.changeDate) &&
                Objects.equals(changeUserId, that.changeUserId) &&
                Objects.equals(changePartnersId, that.changePartnersId) &&
                Objects.equals(createman, that.createman) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(lastaltertime, that.lastaltertime) &&
                Objects.equals(lastalterman, that.lastalterman) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(couponType, that.couponType) &&
                Objects.equals(couponValue, that.couponValue) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(qrDesc, that.qrDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponId, userId, channelId, qrImg, changeCode, checkCode, content, startTime, endTime, recodeState, changeDate, changeUserId, changePartnersId, createman, createtime, lastaltertime, lastalterman, status, remark, couponType, couponValue, shopId, qrDesc);
    }
}
