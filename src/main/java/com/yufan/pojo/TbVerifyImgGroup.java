package com.yufan.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/6/28
 */
@Entity
@Table(name = "tb_verify_img_group", schema = "store_db", catalog = "")
public class TbVerifyImgGroup {
    private int id;
    private String verifyCode;
    private String verifyTitle;
    private Integer status;
    private String createman;
    private Timestamp createtime;

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
    @Column(name = "verify_code", nullable = true, length = 30)
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    @Basic
    @Column(name = "verify_title", nullable = true, length = 100)
    public String getVerifyTitle() {
        return verifyTitle;
    }

    public void setVerifyTitle(String verifyTitle) {
        this.verifyTitle = verifyTitle;
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
    @Column(name = "createman", nullable = true, length = 50)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbVerifyImgGroup that = (TbVerifyImgGroup) o;
        return id == that.id &&
                Objects.equals(verifyCode, that.verifyCode) &&
                Objects.equals(verifyTitle, that.verifyTitle) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createman, that.createman) &&
                Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, verifyCode, verifyTitle, status, createman, createtime);
    }
}
