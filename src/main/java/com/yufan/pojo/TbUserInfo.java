package com.yufan.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/6/14
 */
@Entity
@Table(name = "tb_user_info", schema = "store_db", catalog = "")
public class TbUserInfo {
    private int userId;
    private String loginName;
    private String loginPass;
    private String loginPassShow;
    private String nickName;
    private String userEmail;
    private Integer emailValite;
    private String userMobile;
    private Integer mobileValite;
    private Integer logCount;
    private int userState;
    private Timestamp createtime;
    private Timestamp lastlogintime;
    private Timestamp lastaltertime;
    private String userImg;
    private Integer shopId;
    private String memberId;
    private BigDecimal money;
    private Timestamp startTime;
    private Timestamp endTime;
    private String inviterNum;
    private Integer inviterJf;
    private BigDecimal inviterMoney;
    private Integer jifen;
    private Integer tuijianCount;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "login_name", nullable = true, length = 255)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "login_pass", nullable = true, length = 255)
    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    @Basic
    @Column(name = "login_pass_show", nullable = true, length = 255)
    public String getLoginPassShow() {
        return loginPassShow;
    }

    public void setLoginPassShow(String loginPassShow) {
        this.loginPassShow = loginPassShow;
    }

    @Basic
    @Column(name = "nick_name", nullable = true, length = 255)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "user_email", nullable = true, length = 255)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "email_valite", nullable = true)
    public Integer getEmailValite() {
        return emailValite;
    }

    public void setEmailValite(Integer emailValite) {
        this.emailValite = emailValite;
    }

    @Basic
    @Column(name = "user_mobile", nullable = true, length = 20)
    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    @Basic
    @Column(name = "mobile_valite", nullable = true)
    public Integer getMobileValite() {
        return mobileValite;
    }

    public void setMobileValite(Integer mobileValite) {
        this.mobileValite = mobileValite;
    }

    @Basic
    @Column(name = "log_count", nullable = true)
    public Integer getLogCount() {
        return logCount;
    }

    public void setLogCount(Integer logCount) {
        this.logCount = logCount;
    }

    @Basic
    @Column(name = "user_state", nullable = false)
    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
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
    @Column(name = "lastlogintime", nullable = true)
    public Timestamp getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Timestamp lastlogintime) {
        this.lastlogintime = lastlogintime;
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
    @Column(name = "user_img", nullable = true, length = 100)
    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
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
    @Column(name = "member_id", nullable = true, length = 50)
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "money", nullable = true, precision = 2)
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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
    @Column(name = "inviter_num", nullable = true, length = 50)
    public String getInviterNum() {
        return inviterNum;
    }

    public void setInviterNum(String inviterNum) {
        this.inviterNum = inviterNum;
    }

    @Basic
    @Column(name = "inviter_jf", nullable = true)
    public Integer getInviterJf() {
        return inviterJf;
    }

    public void setInviterJf(Integer inviterJf) {
        this.inviterJf = inviterJf;
    }

    @Basic
    @Column(name = "inviter_money", nullable = true, precision = 2)
    public BigDecimal getInviterMoney() {
        return inviterMoney;
    }

    public void setInviterMoney(BigDecimal inviterMoney) {
        this.inviterMoney = inviterMoney;
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
    @Column(name = "tuijian_count", nullable = true)
    public Integer getTuijianCount() {
        return tuijianCount;
    }

    public void setTuijianCount(Integer tuijianCount) {
        this.tuijianCount = tuijianCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUserInfo userInfo = (TbUserInfo) o;
        return userId == userInfo.userId &&
                userState == userInfo.userState &&
                Objects.equals(loginName, userInfo.loginName) &&
                Objects.equals(loginPass, userInfo.loginPass) &&
                Objects.equals(loginPassShow, userInfo.loginPassShow) &&
                Objects.equals(nickName, userInfo.nickName) &&
                Objects.equals(userEmail, userInfo.userEmail) &&
                Objects.equals(emailValite, userInfo.emailValite) &&
                Objects.equals(userMobile, userInfo.userMobile) &&
                Objects.equals(mobileValite, userInfo.mobileValite) &&
                Objects.equals(logCount, userInfo.logCount) &&
                Objects.equals(createtime, userInfo.createtime) &&
                Objects.equals(lastlogintime, userInfo.lastlogintime) &&
                Objects.equals(lastaltertime, userInfo.lastaltertime) &&
                Objects.equals(userImg, userInfo.userImg) &&
                Objects.equals(shopId, userInfo.shopId) &&
                Objects.equals(memberId, userInfo.memberId) &&
                Objects.equals(money, userInfo.money) &&
                Objects.equals(startTime, userInfo.startTime) &&
                Objects.equals(endTime, userInfo.endTime) &&
                Objects.equals(inviterNum, userInfo.inviterNum) &&
                Objects.equals(inviterJf, userInfo.inviterJf) &&
                Objects.equals(inviterMoney, userInfo.inviterMoney) &&
                Objects.equals(jifen, userInfo.jifen) &&
                Objects.equals(tuijianCount, userInfo.tuijianCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, loginName, loginPass, loginPassShow, nickName, userEmail, emailValite, userMobile, mobileValite, logCount, userState, createtime, lastlogintime, lastaltertime, userImg, shopId, memberId, money, startTime, endTime, inviterNum, inviterJf, inviterMoney, jifen, tuijianCount);
    }
}
