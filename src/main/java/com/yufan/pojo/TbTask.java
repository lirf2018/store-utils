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
@Table(name = "tb_task", schema = "store_db", catalog = "")
public class TbTask {
    private int taskId;
    private String taskCode;
    private String taskName;
    private Timestamp startTime;
    private Timestamp endTime;
    private Timestamp validDate;
    private String status;
    private String createman;
    private Timestamp createtime;
    private Integer shopId;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "task_id", nullable = false)
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "task_code", nullable = true, length = 50)
    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    @Basic
    @Column(name = "task_name", nullable = true, length = 100)
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
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
    @Column(name = "valid_date", nullable = true)
    public Timestamp getValidDate() {
        return validDate;
    }

    public void setValidDate(Timestamp validDate) {
        this.validDate = validDate;
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
    @Column(name = "createman", nullable = true, length = 255)
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
    @Column(name = "shop_id", nullable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbTask tbTask = (TbTask) o;
        return taskId == tbTask.taskId &&
                Objects.equals(taskCode, tbTask.taskCode) &&
                Objects.equals(taskName, tbTask.taskName) &&
                Objects.equals(startTime, tbTask.startTime) &&
                Objects.equals(endTime, tbTask.endTime) &&
                Objects.equals(validDate, tbTask.validDate) &&
                Objects.equals(status, tbTask.status) &&
                Objects.equals(createman, tbTask.createman) &&
                Objects.equals(createtime, tbTask.createtime) &&
                Objects.equals(shopId, tbTask.shopId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskCode, taskName, startTime, endTime, validDate, status, createman, createtime, shopId);
    }
}
