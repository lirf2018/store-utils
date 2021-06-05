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
@Table(name = "tb_weixin_access_token", schema = "store_db", catalog = "")
public class TbWeixinAccessToken {
    private int id;
    private String combineCode;
    private Timestamp expiryDate;
    private String accessToken;
    private Integer status;
    private Timestamp createDate;

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
    @Column(name = "combine_code", nullable = true, length = 255)
    public String getCombineCode() {
        return combineCode;
    }

    public void setCombineCode(String combineCode) {
        this.combineCode = combineCode;
    }

    @Basic
    @Column(name = "expiry_date", nullable = true)
    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Basic
    @Column(name = "access_token", nullable = true, length = 600)
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbWeixinAccessToken that = (TbWeixinAccessToken) o;
        return id == that.id &&
                Objects.equals(combineCode, that.combineCode) &&
                Objects.equals(expiryDate, that.expiryDate) &&
                Objects.equals(accessToken, that.accessToken) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createDate, that.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, combineCode, expiryDate, accessToken, status, createDate);
    }
}
