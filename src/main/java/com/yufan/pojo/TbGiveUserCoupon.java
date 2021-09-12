package com.yufan.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/8/24
 */
@Entity
@Table(name = "tb_give_user_coupon", schema = "store_db", catalog = "")
public class TbGiveUserCoupon {
    private int id;
    private Integer userId;
    private Integer couponId;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer addFrom;
    private Date outTime;

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
    @Column(name = "coupon_id", nullable = true)
    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
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
    @Column(name = "add_from", nullable = true)
    public Integer getAddFrom() {
        return addFrom;
    }

    public void setAddFrom(Integer addFrom) {
        this.addFrom = addFrom;
    }

    @Basic
    @Column(name = "out_time", nullable = true)
    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbGiveUserCoupon that = (TbGiveUserCoupon) o;
        return id == that.id &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(couponId, that.couponId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(addFrom, that.addFrom) &&
                Objects.equals(outTime, that.outTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, couponId, status, createTime, updateTime, addFrom, outTime);
    }
}
