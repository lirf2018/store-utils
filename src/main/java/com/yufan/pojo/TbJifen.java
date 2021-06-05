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
@Table(name = "tb_jifen", schema = "store_db", catalog = "")
public class TbJifen {
    private int id;
    private Integer taskId;
    private Integer isInout;
    private Integer jifen;
    private String items;
    private Integer userId;
    private Timestamp createtime;
    private Integer status;
    private Timestamp lastaltertime;
    private Integer shopId;
    private Timestamp passTime;
    private String itemMark;

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
    @Column(name = "task_id", nullable = true)
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "is_inout", nullable = true)
    public Integer getIsInout() {
        return isInout;
    }

    public void setIsInout(Integer isInout) {
        this.isInout = isInout;
    }

    @Basic
    @Column(name = "jifen", nullable = true)
    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    @Basic
    @Column(name = "items", nullable = true, length = 255)
    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
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
    @Column(name = "createtime", nullable = true)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
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
    @Column(name = "lastaltertime", nullable = true)
    public Timestamp getLastaltertime() {
        return lastaltertime;
    }

    public void setLastaltertime(Timestamp lastaltertime) {
        this.lastaltertime = lastaltertime;
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
    @Column(name = "pass_time", nullable = true)
    public Timestamp getPassTime() {
        return passTime;
    }

    public void setPassTime(Timestamp passTime) {
        this.passTime = passTime;
    }

    @Basic
    @Column(name = "item_mark", nullable = true, length = 50)
    public String getItemMark() {
        return itemMark;
    }

    public void setItemMark(String itemMark) {
        this.itemMark = itemMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbJifen tbJifen = (TbJifen) o;
        return id == tbJifen.id &&
                Objects.equals(taskId, tbJifen.taskId) &&
                Objects.equals(isInout, tbJifen.isInout) &&
                Objects.equals(jifen, tbJifen.jifen) &&
                Objects.equals(items, tbJifen.items) &&
                Objects.equals(userId, tbJifen.userId) &&
                Objects.equals(createtime, tbJifen.createtime) &&
                Objects.equals(status, tbJifen.status) &&
                Objects.equals(lastaltertime, tbJifen.lastaltertime) &&
                Objects.equals(shopId, tbJifen.shopId) &&
                Objects.equals(passTime, tbJifen.passTime) &&
                Objects.equals(itemMark, tbJifen.itemMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskId, isInout, jifen, items, userId, createtime, status, lastaltertime, shopId, passTime, itemMark);
    }
}
