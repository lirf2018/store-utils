package com.yufan.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/6/29
 */
@Entity
@Table(name = "tb_verify_img", schema = "store_db", catalog = "")
public class TbVerifyImg {
    private int id;
    private String verifyCode;
    private String verifyImg;
    private Integer status;
    private Integer verifyType;
    private String word;
    private String createman;
    private Timestamp createtime;
    private String imgUuid;

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
    @Column(name = "verify_code", nullable = true, length = 50)
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    @Basic
    @Column(name = "verify_img", nullable = true, length = 100)
    public String getVerifyImg() {
        return verifyImg;
    }

    public void setVerifyImg(String verifyImg) {
        this.verifyImg = verifyImg;
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
    @Column(name = "verify_type", nullable = true)
    public Integer getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(Integer verifyType) {
        this.verifyType = verifyType;
    }

    @Basic
    @Column(name = "word", nullable = true, length = 30)
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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

    @Basic
    @Column(name = "img_uuid", nullable = true, length = 40)
    public String getImgUuid() {
        return imgUuid;
    }

    public void setImgUuid(String imgUuid) {
        this.imgUuid = imgUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbVerifyImg that = (TbVerifyImg) o;
        return id == that.id &&
                Objects.equals(verifyCode, that.verifyCode) &&
                Objects.equals(verifyImg, that.verifyImg) &&
                Objects.equals(status, that.status) &&
                Objects.equals(verifyType, that.verifyType) &&
                Objects.equals(word, that.word) &&
                Objects.equals(createman, that.createman) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(imgUuid, that.imgUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, verifyCode, verifyImg, status, verifyType, word, createman, createtime, imgUuid);
    }
}
