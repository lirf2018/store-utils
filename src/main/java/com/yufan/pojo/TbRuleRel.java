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
@Table(name = "tb_rule_rel", schema = "store_db", catalog = "")
public class TbRuleRel {
    private int id;
    private Integer relId;
    private Integer ruleId;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer validDate;
    private Integer relIdType;
    private Timestamp createtime;
    private String createman;
    private Integer isMakeSure;

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
    @Column(name = "rel_id", nullable = true)
    public Integer getRelId() {
        return relId;
    }

    public void setRelId(Integer relId) {
        this.relId = relId;
    }

    @Basic
    @Column(name = "rule_id", nullable = true)
    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
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
    public Integer getValidDate() {
        return validDate;
    }

    public void setValidDate(Integer validDate) {
        this.validDate = validDate;
    }

    @Basic
    @Column(name = "rel_id_type", nullable = true)
    public Integer getRelIdType() {
        return relIdType;
    }

    public void setRelIdType(Integer relIdType) {
        this.relIdType = relIdType;
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
    @Column(name = "createman", nullable = true, length = 100)
    public String getCreateman() {
        return createman;
    }

    public void setCreateman(String createman) {
        this.createman = createman;
    }

    @Basic
    @Column(name = "is_make_sure", nullable = true)
    public Integer getIsMakeSure() {
        return isMakeSure;
    }

    public void setIsMakeSure(Integer isMakeSure) {
        this.isMakeSure = isMakeSure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbRuleRel tbRuleRel = (TbRuleRel) o;
        return id == tbRuleRel.id &&
                Objects.equals(relId, tbRuleRel.relId) &&
                Objects.equals(ruleId, tbRuleRel.ruleId) &&
                Objects.equals(startTime, tbRuleRel.startTime) &&
                Objects.equals(endTime, tbRuleRel.endTime) &&
                Objects.equals(validDate, tbRuleRel.validDate) &&
                Objects.equals(relIdType, tbRuleRel.relIdType) &&
                Objects.equals(createtime, tbRuleRel.createtime) &&
                Objects.equals(createman, tbRuleRel.createman) &&
                Objects.equals(isMakeSure, tbRuleRel.isMakeSure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, relId, ruleId, startTime, endTime, validDate, relIdType, createtime, createman, isMakeSure);
    }
}
