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
@Table(name = "tb_shop_partners_rel", schema = "store_db", catalog = "")
public class TbShopPartnersRel {
    private int id;
    private Integer shopId;
    private Integer partnersId;
    private String createman;
    private Timestamp createtime;

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
    @Column(name = "shop_id", nullable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "partners_id", nullable = true)
    public Integer getPartnersId() {
        return partnersId;
    }

    public void setPartnersId(Integer partnersId) {
        this.partnersId = partnersId;
    }

    @Basic
    @Column(name = "createman", nullable = true, length = 255)
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
        TbShopPartnersRel that = (TbShopPartnersRel) o;
        return id == that.id &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(partnersId, that.partnersId) &&
                Objects.equals(createman, that.createman) &&
                Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shopId, partnersId, createman, createtime);
    }
}
