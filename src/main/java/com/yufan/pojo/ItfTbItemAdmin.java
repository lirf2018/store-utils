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
@Table(name = "itf_tb_item_admin", schema = "store_db_online", catalog = "")
public class ItfTbItemAdmin {
    private int adminId;
    private String adminName;
    private String passwd;
    private String status;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String adminToken;
    private Timestamp tokenPassTime;
    private String adminType;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "admin_id", nullable = false)
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "admin_name", nullable = true, length = 50)
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Basic
    @Column(name = "passwd", nullable = true, length = 50)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
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
    @Column(name = "admin_token", nullable = true, length = 100)
    public String getAdminToken() {
        return adminToken;
    }

    public void setAdminToken(String adminToken) {
        this.adminToken = adminToken;
    }

    @Basic
    @Column(name = "token_pass_time", nullable = true)
    public Timestamp getTokenPassTime() {
        return tokenPassTime;
    }

    public void setTokenPassTime(Timestamp tokenPassTime) {
        this.tokenPassTime = tokenPassTime;
    }

    @Basic
    @Column(name = "admin_type", nullable = true, length = 1)
    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItfTbItemAdmin admin = (ItfTbItemAdmin) o;
        return adminId == admin.adminId &&
                Objects.equals(adminName, admin.adminName) &&
                Objects.equals(passwd, admin.passwd) &&
                Objects.equals(status, admin.status) &&
                Objects.equals(createtime, admin.createtime) &&
                Objects.equals(lastaltertime, admin.lastaltertime) &&
                Objects.equals(adminToken, admin.adminToken) &&
                Objects.equals(tokenPassTime, admin.tokenPassTime) &&
                Objects.equals(adminType, admin.adminType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, adminName, passwd, status, createtime, lastaltertime, adminToken, tokenPassTime, adminType);
    }
}
