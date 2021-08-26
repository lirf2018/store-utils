package com.yufan.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/8/22
 */
@Entity
@Table(name = "tb_param", schema = "store_db", catalog = "")
public class TbParam {
    private int paramId;
    private String paramName;
    private String paramCode;
    private String paramKey;
    private String paramValue;
    private String paramValue1;
    private String paramValue2;
    private String paramValue3;
    private String paramValue4;
    private String paramValue5;
    private String paramValue6;
    private String createman;
    private Timestamp createtime;
    private Integer status;
    private String remark;
    private Integer isMakeSure;
    private Integer dataIndex;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "param_id", nullable = false)
    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId;
    }

    @Basic
    @Column(name = "param_name", nullable = true, length = 40)
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @Basic
    @Column(name = "param_code", nullable = true, length = 100)
    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    @Basic
    @Column(name = "param_key", nullable = true, length = 100)
    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    @Basic
    @Column(name = "param_value", nullable = true, length = 200)
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Basic
    @Column(name = "param_value1", nullable = true, length = 200)
    public String getParamValue1() {
        return paramValue1;
    }

    public void setParamValue1(String paramValue1) {
        this.paramValue1 = paramValue1;
    }

    @Basic
    @Column(name = "param_value2", nullable = true, length = 200)
    public String getParamValue2() {
        return paramValue2;
    }

    public void setParamValue2(String paramValue2) {
        this.paramValue2 = paramValue2;
    }

    @Basic
    @Column(name = "param_value3", nullable = true, length = 200)
    public String getParamValue3() {
        return paramValue3;
    }

    public void setParamValue3(String paramValue3) {
        this.paramValue3 = paramValue3;
    }

    @Basic
    @Column(name = "param_value4", nullable = true, length = 200)
    public String getParamValue4() {
        return paramValue4;
    }

    public void setParamValue4(String paramValue4) {
        this.paramValue4 = paramValue4;
    }

    @Basic
    @Column(name = "param_value5", nullable = true, length = 200)
    public String getParamValue5() {
        return paramValue5;
    }

    public void setParamValue5(String paramValue5) {
        this.paramValue5 = paramValue5;
    }

    @Basic
    @Column(name = "param_value6", nullable = true, length = -1)
    public String getParamValue6() {
        return paramValue6;
    }

    public void setParamValue6(String paramValue6) {
        this.paramValue6 = paramValue6;
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
    @Column(name = "data_index", nullable = true)
    public Integer getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(Integer dataIndex) {
        this.dataIndex = dataIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbParam param = (TbParam) o;
        return paramId == param.paramId &&
                Objects.equals(paramName, param.paramName) &&
                Objects.equals(paramCode, param.paramCode) &&
                Objects.equals(paramKey, param.paramKey) &&
                Objects.equals(paramValue, param.paramValue) &&
                Objects.equals(paramValue1, param.paramValue1) &&
                Objects.equals(paramValue2, param.paramValue2) &&
                Objects.equals(paramValue3, param.paramValue3) &&
                Objects.equals(paramValue4, param.paramValue4) &&
                Objects.equals(paramValue5, param.paramValue5) &&
                Objects.equals(paramValue6, param.paramValue6) &&
                Objects.equals(createman, param.createman) &&
                Objects.equals(createtime, param.createtime) &&
                Objects.equals(status, param.status) &&
                Objects.equals(remark, param.remark) &&
                Objects.equals(isMakeSure, param.isMakeSure) &&
                Objects.equals(dataIndex, param.dataIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramId, paramName, paramCode, paramKey, paramValue, paramValue1, paramValue2, paramValue3, paramValue4, paramValue5, paramValue6, createman, createtime, status, remark, isMakeSure, dataIndex);
    }
}
