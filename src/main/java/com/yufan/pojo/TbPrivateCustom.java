package com.yufan.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/7/4
 */
@Entity
@Table(name = "tb_private_custom", schema = "store_db", catalog = "")
public class TbPrivateCustom {
    private int id;
    private Integer userId;
    private Timestamp payTime;
    private String privateCode;
    private Integer relType;
    private Timestamp reservationTime;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer status;
    private String contents;
    private Timestamp getTime;
    private String getTimeStr;
    private Byte postWay;
    private Byte isYuyue;
    private Integer flowStatus;
    private Integer goodsId;
    private String goodsName;
    private Integer skuId;
    private Integer yuyueCount;
    private Integer indexSort;
    private String getAddr;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "pay_time", nullable = true)
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "private_code", nullable = true, length = 50)
    public String getPrivateCode() {
        return privateCode;
    }

    public void setPrivateCode(String privateCode) {
        this.privateCode = privateCode;
    }

    @Basic
    @Column(name = "rel_type", nullable = true)
    public Integer getRelType() {
        return relType;
    }

    public void setRelType(Integer relType) {
        this.relType = relType;
    }

    @Basic
    @Column(name = "reservation_time", nullable = true)
    public Timestamp getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Timestamp reservationTime) {
        this.reservationTime = reservationTime;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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
    @Column(name = "contents", nullable = true, length = -1)
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Basic
    @Column(name = "get_time", nullable = true)
    public Timestamp getGetTime() {
        return getTime;
    }

    public void setGetTime(Timestamp getTime) {
        this.getTime = getTime;
    }

    @Basic
    @Column(name = "get_time_str", nullable = true, length = 50)
    public String getGetTimeStr() {
        return getTimeStr;
    }

    public void setGetTimeStr(String getTimeStr) {
        this.getTimeStr = getTimeStr;
    }

    @Basic
    @Column(name = "post_way", nullable = true)
    public Byte getPostWay() {
        return postWay;
    }

    public void setPostWay(Byte postWay) {
        this.postWay = postWay;
    }

    @Basic
    @Column(name = "is_yuyue", nullable = true)
    public Byte getIsYuyue() {
        return isYuyue;
    }

    public void setIsYuyue(Byte isYuyue) {
        this.isYuyue = isYuyue;
    }

    @Basic
    @Column(name = "flow_status", nullable = true)
    public Integer getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(Integer flowStatus) {
        this.flowStatus = flowStatus;
    }

    @Basic
    @Column(name = "goods_id", nullable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_name", nullable = true, length = 100)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "sku_id", nullable = true)
    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    @Basic
    @Column(name = "yuyue_count", nullable = true)
    public Integer getYuyueCount() {
        return yuyueCount;
    }

    public void setYuyueCount(Integer yuyueCount) {
        this.yuyueCount = yuyueCount;
    }

    @Basic
    @Column(name = "index_sort", nullable = true)
    public Integer getIndexSort() {
        return indexSort;
    }

    public void setIndexSort(Integer indexSort) {
        this.indexSort = indexSort;
    }

    @Basic
    @Column(name = "get_addr", nullable = true, length = 100)
    public String getGetAddr() {
        return getAddr;
    }

    public void setGetAddr(String getAddr) {
        this.getAddr = getAddr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbPrivateCustom custom = (TbPrivateCustom) o;
        return id == custom.id &&
                Objects.equals(userId, custom.userId) &&
                Objects.equals(payTime, custom.payTime) &&
                Objects.equals(privateCode, custom.privateCode) &&
                Objects.equals(relType, custom.relType) &&
                Objects.equals(reservationTime, custom.reservationTime) &&
                Objects.equals(createTime, custom.createTime) &&
                Objects.equals(updateTime, custom.updateTime) &&
                Objects.equals(status, custom.status) &&
                Objects.equals(contents, custom.contents) &&
                Objects.equals(getTime, custom.getTime) &&
                Objects.equals(getTimeStr, custom.getTimeStr) &&
                Objects.equals(postWay, custom.postWay) &&
                Objects.equals(isYuyue, custom.isYuyue) &&
                Objects.equals(flowStatus, custom.flowStatus) &&
                Objects.equals(goodsId, custom.goodsId) &&
                Objects.equals(goodsName, custom.goodsName) &&
                Objects.equals(skuId, custom.skuId) &&
                Objects.equals(yuyueCount, custom.yuyueCount) &&
                Objects.equals(indexSort, custom.indexSort) &&
                Objects.equals(getAddr, custom.getAddr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, payTime, privateCode, relType, reservationTime, createTime, updateTime, status, contents, getTime, getTimeStr, postWay, isYuyue, flowStatus, goodsId, goodsName, skuId, yuyueCount, indexSort, getAddr);
    }
}
