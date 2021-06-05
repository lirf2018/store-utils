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
@Table(name = "tb_user_rel", schema = "store_db", catalog = "")
public class TbUserRel {
    private int id;
    private Integer userId;
    private Integer userIdRel;
    private Timestamp createDate;
    private Integer status;

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
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_id_rel", nullable = true)
    public Integer getUserIdRel() {
        return userIdRel;
    }

    public void setUserIdRel(Integer userIdRel) {
        this.userIdRel = userIdRel;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUserRel tbUserRel = (TbUserRel) o;
        return id == tbUserRel.id &&
                Objects.equals(userId, tbUserRel.userId) &&
                Objects.equals(userIdRel, tbUserRel.userIdRel) &&
                Objects.equals(createDate, tbUserRel.createDate) &&
                Objects.equals(status, tbUserRel.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, userIdRel, createDate, status);
    }
}
