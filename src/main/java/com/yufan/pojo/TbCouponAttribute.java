package com.yufan.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/5/16
 */
@Entity
@Table(name = "tb_coupon_attribute", schema = "store_db", catalog = "")
public class TbCouponAttribute {
    private int attrId;
    private Integer couponId;
    private Integer propId;
    private Integer valueId;
    private Timestamp createtime;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "attr_id", nullable = false)
    public int getAttrId() {
        return attrId;
    }

    public void setAttrId(int attrId) {
        this.attrId = attrId;
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
    @Column(name = "prop_id", nullable = true)
    public Integer getPropId() {
        return propId;
    }

    public void setPropId(Integer propId) {
        this.propId = propId;
    }

    @Basic
    @Column(name = "value_id", nullable = true)
    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "createtime", nullable = true)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbCouponAttribute that = (TbCouponAttribute) o;
        return attrId == that.attrId &&
                Objects.equals(couponId, that.couponId) &&
                Objects.equals(propId, that.propId) &&
                Objects.equals(valueId, that.valueId) &&
                Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attrId, couponId, propId, valueId, createtime);
    }
}
