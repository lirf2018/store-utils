package com.yufan.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/6/6
 */
@Entity
@Table(name = "tb_private_custom", schema = "store_db", catalog = "")
public class TbPrivateCustom {
    private int id;
    private Timestamp payTime;
    private String privateCode;
    private Timestamp reservationTime;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer status;
    private String contents;
    private Timestamp getTime;
    private Byte postWay;
    private Byte isYuyue;
    private Integer userId;

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
    @Column(name = "contents", nullable = true, length = 255)
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
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbPrivateCustom that = (TbPrivateCustom) o;
        return id == that.id &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(privateCode, that.privateCode) &&
                Objects.equals(reservationTime, that.reservationTime) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(contents, that.contents) &&
                Objects.equals(getTime, that.getTime) &&
                Objects.equals(postWay, that.postWay) &&
                Objects.equals(isYuyue, that.isYuyue) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, payTime, privateCode, reservationTime, createTime, updateTime, status, contents, getTime, postWay, isYuyue, userId);
    }
}
