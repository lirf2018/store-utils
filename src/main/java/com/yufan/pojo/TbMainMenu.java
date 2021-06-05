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
@Table(name = "tb_main_menu", schema = "store_db", catalog = "")
public class TbMainMenu {
    private int id;
    private String menuName;
    private String menuImg;
    private Integer menuSort;
    private String menuUrl;
    private Integer status;
    private String leve1Ids;
    private String categoryIds;
    private Timestamp createtime;
    private Integer shopId;

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
    @Column(name = "menu_name", nullable = true, length = 50)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "menu_img", nullable = true, length = 100)
    public String getMenuImg() {
        return menuImg;
    }

    public void setMenuImg(String menuImg) {
        this.menuImg = menuImg;
    }

    @Basic
    @Column(name = "menu_sort", nullable = true)
    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    @Basic
    @Column(name = "menu_url", nullable = true, length = 200)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
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
    @Column(name = "leve1_ids", nullable = true, length = 100)
    public String getLeve1Ids() {
        return leve1Ids;
    }

    public void setLeve1Ids(String leve1Ids) {
        this.leve1Ids = leve1Ids;
    }

    @Basic
    @Column(name = "category_ids", nullable = true, length = 100)
    public String getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
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
        TbMainMenu that = (TbMainMenu) o;
        return id == that.id &&
                Objects.equals(menuName, that.menuName) &&
                Objects.equals(menuImg, that.menuImg) &&
                Objects.equals(menuSort, that.menuSort) &&
                Objects.equals(menuUrl, that.menuUrl) &&
                Objects.equals(status, that.status) &&
                Objects.equals(leve1Ids, that.leve1Ids) &&
                Objects.equals(categoryIds, that.categoryIds) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(shopId, that.shopId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, menuName, menuImg, menuSort, menuUrl, status, leve1Ids, categoryIds, createtime, shopId);
    }
}
