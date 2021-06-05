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
@Table(name = "tb_partners", schema = "store_db", catalog = "")
public class TbPartners {
    private int id;
    private String partnersCode;
    private String partnersName;
    private Integer shopId;
    private String createman;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
    private Integer status;
    private String remark;
    private Integer partnersSort;
    private String firstNameCode;
    private String account;
    private String passwd;
    private String secretKey;
    private String partnersImg;
    private String passwdShow;
    private Integer isRecommend;

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
    @Column(name = "partners_code", nullable = true, length = 100)
    public String getPartnersCode() {
        return partnersCode;
    }

    public void setPartnersCode(String partnersCode) {
        this.partnersCode = partnersCode;
    }

    @Basic
    @Column(name = "partners_name", nullable = true, length = 255)
    public String getPartnersName() {
        return partnersName;
    }

    public void setPartnersName(String partnersName) {
        this.partnersName = partnersName;
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
    @Column(name = "createman", nullable = true, length = 100)
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
    @Column(name = "lastaltertime", nullable = true)
    public Timestamp getLastaltertime() {
        return lastaltertime;
    }

    public void setLastaltertime(Timestamp lastaltertime) {
        this.lastaltertime = lastaltertime;
    }

    @Basic
    @Column(name = "lastalterman", nullable = true, length = 255)
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

    @Basic
    @Column(name = "partners_sort", nullable = true)
    public Integer getPartnersSort() {
        return partnersSort;
    }

    public void setPartnersSort(Integer partnersSort) {
        this.partnersSort = partnersSort;
    }

    @Basic
    @Column(name = "first_name_code", nullable = true, length = 2)
    public String getFirstNameCode() {
        return firstNameCode;
    }

    public void setFirstNameCode(String firstNameCode) {
        this.firstNameCode = firstNameCode;
    }

    @Basic
    @Column(name = "account", nullable = true, length = 100)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "passwd", nullable = true, length = 200)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "secret_key", nullable = true, length = 32)
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @Basic
    @Column(name = "partners_img", nullable = true, length = 200)
    public String getPartnersImg() {
        return partnersImg;
    }

    public void setPartnersImg(String partnersImg) {
        this.partnersImg = partnersImg;
    }

    @Basic
    @Column(name = "passwd_show", nullable = true, length = 200)
    public String getPasswdShow() {
        return passwdShow;
    }

    public void setPasswdShow(String passwdShow) {
        this.passwdShow = passwdShow;
    }

    @Basic
    @Column(name = "is_recommend", nullable = true)
    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbPartners that = (TbPartners) o;
        return id == that.id &&
                Objects.equals(partnersCode, that.partnersCode) &&
                Objects.equals(partnersName, that.partnersName) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(createman, that.createman) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(lastaltertime, that.lastaltertime) &&
                Objects.equals(lastalterman, that.lastalterman) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(partnersSort, that.partnersSort) &&
                Objects.equals(firstNameCode, that.firstNameCode) &&
                Objects.equals(account, that.account) &&
                Objects.equals(passwd, that.passwd) &&
                Objects.equals(secretKey, that.secretKey) &&
                Objects.equals(partnersImg, that.partnersImg) &&
                Objects.equals(passwdShow, that.passwdShow) &&
                Objects.equals(isRecommend, that.isRecommend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, partnersCode, partnersName, shopId, createman, createtime, lastaltertime, lastalterman, status, remark, partnersSort, firstNameCode, account, passwd, secretKey, partnersImg, passwdShow, isRecommend);
    }
}
