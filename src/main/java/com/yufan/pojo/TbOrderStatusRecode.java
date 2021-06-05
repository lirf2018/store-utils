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
@Table(name = "tb_order_status_recode", schema = "store_db", catalog = "")
public class TbOrderStatusRecode {
    private int id;
    private String orderNo;
    private Integer orderStatus;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
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
    @Column(name = "order_no", nullable = true, length = 50)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "order_status", nullable = true)
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
    @Column(name = "lastalterman", nullable = true, length = 50)
    public String getLastalterman() {
        return lastalterman;
    }

    public void setLastalterman(String lastalterman) {
        this.lastalterman = lastalterman;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 300)
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
        TbOrderStatusRecode that = (TbOrderStatusRecode) o;
        return id == that.id &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(lastaltertime, that.lastaltertime) &&
                Objects.equals(lastalterman, that.lastalterman) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNo, orderStatus, createtime, lastaltertime, lastalterman, remark);
    }
}
