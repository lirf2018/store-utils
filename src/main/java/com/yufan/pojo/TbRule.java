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
@Table(name = "tb_rule", schema = "store_db", catalog = "")
public class TbRule {
    private int ruleId;
    private String ruleName;
    private String ruleCode;
    private Integer ruleType;
    private String ruleValue;
    private Integer ruleBelong;
    private String ruleDesc;
    private String createman;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
    private Integer status;
    private String remark;
    private Integer isMakeSure;
    private Integer shopId;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "rule_id", nullable = false)
    public int getRuleId() {
        return ruleId;
    }

    public void setRuleId(int ruleId) {
        this.ruleId = ruleId;
    }

    @Basic
    @Column(name = "rule_name", nullable = true, length = 40)
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Basic
    @Column(name = "rule_code", nullable = true, length = 100)
    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    @Basic
    @Column(name = "rule_type", nullable = true)
    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    @Basic
    @Column(name = "rule_value", nullable = true, length = 100)
    public String getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }

    @Basic
    @Column(name = "rule_belong", nullable = true)
    public Integer getRuleBelong() {
        return ruleBelong;
    }

    public void setRuleBelong(Integer ruleBelong) {
        this.ruleBelong = ruleBelong;
    }

    @Basic
    @Column(name = "rule_desc", nullable = true, length = 200)
    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
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
    @Column(name = "lastalterman", nullable = true, length = 100)
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
    @Column(name = "is_make_sure", nullable = true)
    public Integer getIsMakeSure() {
        return isMakeSure;
    }

    public void setIsMakeSure(Integer isMakeSure) {
        this.isMakeSure = isMakeSure;
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
        TbRule tbRule = (TbRule) o;
        return ruleId == tbRule.ruleId &&
                Objects.equals(ruleName, tbRule.ruleName) &&
                Objects.equals(ruleCode, tbRule.ruleCode) &&
                Objects.equals(ruleType, tbRule.ruleType) &&
                Objects.equals(ruleValue, tbRule.ruleValue) &&
                Objects.equals(ruleBelong, tbRule.ruleBelong) &&
                Objects.equals(ruleDesc, tbRule.ruleDesc) &&
                Objects.equals(createman, tbRule.createman) &&
                Objects.equals(createtime, tbRule.createtime) &&
                Objects.equals(lastaltertime, tbRule.lastaltertime) &&
                Objects.equals(lastalterman, tbRule.lastalterman) &&
                Objects.equals(status, tbRule.status) &&
                Objects.equals(remark, tbRule.remark) &&
                Objects.equals(isMakeSure, tbRule.isMakeSure) &&
                Objects.equals(shopId, tbRule.shopId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, ruleName, ruleCode, ruleType, ruleValue, ruleBelong, ruleDesc, createman, createtime, lastaltertime, lastalterman, status, remark, isMakeSure, shopId);
    }
}
