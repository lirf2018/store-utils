package com.yufan.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @description:
 * @author: lirf
 * @time: 2021/5/16
 */
@Entity
@Table(name = "tb_telephone_detail", schema = "store_db", catalog = "")
public class TbTelephoneDetail {
    private int id;
    private int number;
    private String province;
    private String provinceCode;
    private String city;
    private String cityCode;
    private String operator;
    private String peratorCode;

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
    @Column(name = "number", nullable = false)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "province", nullable = true, length = 32)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "province_code", nullable = true, length = 32)
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 32)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "city_code", nullable = true, length = 32)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "operator", nullable = false, length = 12)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "perator_code", nullable = true, length = 32)
    public String getPeratorCode() {
        return peratorCode;
    }

    public void setPeratorCode(String peratorCode) {
        this.peratorCode = peratorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbTelephoneDetail that = (TbTelephoneDetail) o;
        return id == that.id &&
                number == that.number &&
                Objects.equals(province, that.province) &&
                Objects.equals(provinceCode, that.provinceCode) &&
                Objects.equals(city, that.city) &&
                Objects.equals(cityCode, that.cityCode) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(peratorCode, that.peratorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, province, provinceCode, city, cityCode, operator, peratorCode);
    }
}
