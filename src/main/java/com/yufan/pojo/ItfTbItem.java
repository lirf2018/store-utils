package com.yufan.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/9/4
 */
@Entity
@Table(name = "itf_tb_item", schema = "store_db_online", catalog = "")
public class ItfTbItem {
    private int itemId;
    private String itemName;
    private String status;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String remark;
    private String itemType;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "item_id", nullable = false)
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 200)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 1)
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
    @Column(name = "item_type", nullable = true, length = 1)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItfTbItem itfTbItem = (ItfTbItem) o;
        return itemId == itfTbItem.itemId &&
                Objects.equals(itemName, itfTbItem.itemName) &&
                Objects.equals(status, itfTbItem.status) &&
                Objects.equals(createtime, itfTbItem.createtime) &&
                Objects.equals(lastaltertime, itfTbItem.lastaltertime) &&
                Objects.equals(remark, itfTbItem.remark) &&
                Objects.equals(itemType, itfTbItem.itemType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, itemName, status, createtime, lastaltertime, remark, itemType);
    }
}
