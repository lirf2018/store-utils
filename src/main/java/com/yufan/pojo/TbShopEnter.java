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
@Table(name = "tb_shop_enter", schema = "store_db", catalog = "")
public class TbShopEnter {
    private int enterId;
    private Integer shopId;
    private Integer adminId;
    private BigDecimal enterMoney;
    private Timestamp enterStartTime;
    private Timestamp enterEndTime;
    private String createman;
    private String createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
    private Integer status;
    private String remark;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "enter_id", nullable = false)
    public int getEnterId() {
        return enterId;
    }

    public void setEnterId(int enterId) {
        this.enterId = enterId;
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
    @Column(name = "admin_id", nullable = true)
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "enter_money", nullable = true, precision = 2)
    public BigDecimal getEnterMoney() {
        return enterMoney;
    }

    public void setEnterMoney(BigDecimal enterMoney) {
        this.enterMoney = enterMoney;
    }

    @Basic
    @Column(name = "enter_start_time", nullable = true)
    public Timestamp getEnterStartTime() {
        return enterStartTime;
    }

    public void setEnterStartTime(Timestamp enterStartTime) {
        this.enterStartTime = enterStartTime;
    }

    @Basic
    @Column(name = "enter_end_time", nullable = true)
    public Timestamp getEnterEndTime() {
        return enterEndTime;
    }

    public void setEnterEndTime(Timestamp enterEndTime) {
        this.enterEndTime = enterEndTime;
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
    @Column(name = "createtime", nullable = true, length = 100)
    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
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
        TbShopEnter that = (TbShopEnter) o;
        return enterId == that.enterId &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(adminId, that.adminId) &&
                Objects.equals(enterMoney, that.enterMoney) &&
                Objects.equals(enterStartTime, that.enterStartTime) &&
                Objects.equals(enterEndTime, that.enterEndTime) &&
                Objects.equals(createman, that.createman) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(lastaltertime, that.lastaltertime) &&
                Objects.equals(lastalterman, that.lastalterman) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterId, shopId, adminId, enterMoney, enterStartTime, enterEndTime, createman, createtime, lastaltertime, lastalterman, status, remark);
    }
}
