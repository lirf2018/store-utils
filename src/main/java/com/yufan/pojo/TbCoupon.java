package com.yufan.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/6/14
 */
@Entity
@Table(name = "tb_coupon", schema = "store_db", catalog = "")
public class TbCoupon {
    private int couponId;
    private String couponName;
    private String title;
    private String couponImg;
    private String intro;
    private Integer shopId;
    private Integer weight;
    private Integer classifyId;
    private Integer areaId;
    private Integer isShow;
    private Integer couponType;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer outDate;
    private String createman;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
    private Integer status;
    private String remark;
    private String needKnow;
    private Integer couponNum;
    private Integer isPutaway;
    private Integer limitNum;
    private Integer limitWay;
    private Integer leve1Id;
    private Integer appointType;
    private Timestamp appointDate;
    private Timestamp limitBeginTime;
    private Integer getType;
    private BigDecimal couponPrice;
    private Integer countGet;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "coupon_id", nullable = false)
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    @Basic
    @Column(name = "coupon_name", nullable = true, length = 40)
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
    @Column(name = "coupon_img", nullable = true, length = 200)
    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    @Basic
    @Column(name = "intro", nullable = true, length = -1)
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
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
    @Column(name = "weight", nullable = true)
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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
    @Column(name = "area_id", nullable = true)
    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "is_show", nullable = true)
    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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
    @Column(name = "out_date", nullable = true)
    public Integer getOutDate() {
        return outDate;
    }

    public void setOutDate(Integer outDate) {
        this.outDate = outDate;
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
    @Column(name = "need_know", nullable = true, length = -1)
    public String getNeedKnow() {
        return needKnow;
    }

    public void setNeedKnow(String needKnow) {
        this.needKnow = needKnow;
    }

    @Basic
    @Column(name = "coupon_num", nullable = true)
    public Integer getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(Integer couponNum) {
        this.couponNum = couponNum;
    }

    @Basic
    @Column(name = "is_putaway", nullable = true)
    public Integer getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(Integer isPutaway) {
        this.isPutaway = isPutaway;
    }

    @Basic
    @Column(name = "limit_num", nullable = true)
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    @Basic
    @Column(name = "limit_way", nullable = true)
    public Integer getLimitWay() {
        return limitWay;
    }

    public void setLimitWay(Integer limitWay) {
        this.limitWay = limitWay;
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
    @Column(name = "appoint_type", nullable = true)
    public Integer getAppointType() {
        return appointType;
    }

    public void setAppointType(Integer appointType) {
        this.appointType = appointType;
    }

    @Basic
    @Column(name = "appoint_date", nullable = true)
    public Timestamp getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(Timestamp appointDate) {
        this.appointDate = appointDate;
    }

    @Basic
    @Column(name = "limit_begin_time", nullable = true)
    public Timestamp getLimitBeginTime() {
        return limitBeginTime;
    }

    public void setLimitBeginTime(Timestamp limitBeginTime) {
        this.limitBeginTime = limitBeginTime;
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
    @Column(name = "count_get", nullable = true)
    public Integer getCountGet() {
        return countGet;
    }

    public void setCountGet(Integer countGet) {
        this.countGet = countGet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbCoupon coupon = (TbCoupon) o;
        return couponId == coupon.couponId &&
                Objects.equals(couponName, coupon.couponName) &&
                Objects.equals(title, coupon.title) &&
                Objects.equals(couponImg, coupon.couponImg) &&
                Objects.equals(intro, coupon.intro) &&
                Objects.equals(shopId, coupon.shopId) &&
                Objects.equals(weight, coupon.weight) &&
                Objects.equals(classifyId, coupon.classifyId) &&
                Objects.equals(areaId, coupon.areaId) &&
                Objects.equals(isShow, coupon.isShow) &&
                Objects.equals(couponType, coupon.couponType) &&
                Objects.equals(startTime, coupon.startTime) &&
                Objects.equals(endTime, coupon.endTime) &&
                Objects.equals(outDate, coupon.outDate) &&
                Objects.equals(createman, coupon.createman) &&
                Objects.equals(createtime, coupon.createtime) &&
                Objects.equals(lastaltertime, coupon.lastaltertime) &&
                Objects.equals(lastalterman, coupon.lastalterman) &&
                Objects.equals(status, coupon.status) &&
                Objects.equals(remark, coupon.remark) &&
                Objects.equals(needKnow, coupon.needKnow) &&
                Objects.equals(couponNum, coupon.couponNum) &&
                Objects.equals(isPutaway, coupon.isPutaway) &&
                Objects.equals(limitNum, coupon.limitNum) &&
                Objects.equals(limitWay, coupon.limitWay) &&
                Objects.equals(leve1Id, coupon.leve1Id) &&
                Objects.equals(appointType, coupon.appointType) &&
                Objects.equals(appointDate, coupon.appointDate) &&
                Objects.equals(limitBeginTime, coupon.limitBeginTime) &&
                Objects.equals(getType, coupon.getType) &&
                Objects.equals(couponPrice, coupon.couponPrice) &&
                Objects.equals(countGet, coupon.countGet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, couponName, title, couponImg, intro, shopId, weight, classifyId, areaId, isShow, couponType, startTime, endTime, outDate, createman, createtime, lastaltertime, lastalterman, status, remark, needKnow, couponNum, isPutaway, limitNum, limitWay, leve1Id, appointType, appointDate, limitBeginTime, getType, couponPrice, countGet);
    }
}
