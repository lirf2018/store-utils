package com.yufan.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/9/4
 */
@Entity
@Table(name = "itf_tb_item_detail", schema = "store_db_online", catalog = "")
public class ItfTbItemDetail {
    private int itemDetailId;
    private Integer itemId;
    private String itemType;
    private BigDecimal itemPrice;
    private Integer itemYear;
    private Integer itemMonth;
    private Integer itemDate;
    private Integer itemSeason;
    private String status;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String remark;
    private Integer memberId;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "item_detail_id", nullable = false)
    public int getItemDetailId() {
        return itemDetailId;
    }

    public void setItemDetailId(int itemDetailId) {
        this.itemDetailId = itemDetailId;
    }

    @Basic
    @Column(name = "item_id", nullable = true)
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_type", nullable = true, length = 1)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "item_price", nullable = true, precision = 2)
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Basic
    @Column(name = "item_year", nullable = true)
    public Integer getItemYear() {
        return itemYear;
    }

    public void setItemYear(Integer itemYear) {
        this.itemYear = itemYear;
    }

    @Basic
    @Column(name = "item_month", nullable = true)
    public Integer getItemMonth() {
        return itemMonth;
    }

    public void setItemMonth(Integer itemMonth) {
        this.itemMonth = itemMonth;
    }

    @Basic
    @Column(name = "item_date", nullable = true)
    public Integer getItemDate() {
        return itemDate;
    }

    public void setItemDate(Integer itemDate) {
        this.itemDate = itemDate;
    }

    @Basic
    @Column(name = "item_season", nullable = true)
    public Integer getItemSeason() {
        return itemSeason;
    }

    public void setItemSeason(Integer itemSeason) {
        this.itemSeason = itemSeason;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "remark", nullable = true, length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "member_id", nullable = true)
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItfTbItemDetail that = (ItfTbItemDetail) o;
        return itemDetailId == that.itemDetailId &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(itemPrice, that.itemPrice) &&
                Objects.equals(itemYear, that.itemYear) &&
                Objects.equals(itemMonth, that.itemMonth) &&
                Objects.equals(itemDate, that.itemDate) &&
                Objects.equals(itemSeason, that.itemSeason) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(lastaltertime, that.lastaltertime) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemDetailId, itemId, itemType, itemPrice, itemYear, itemMonth, itemDate, itemSeason, status, createtime, lastaltertime, remark, memberId);
    }
}
