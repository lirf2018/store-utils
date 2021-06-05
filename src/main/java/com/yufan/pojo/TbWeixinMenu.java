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
@Table(name = "tb_weixin_menu", schema = "store_db", catalog = "")
public class TbWeixinMenu {
    private int menuId;
    private String menuName;
    private Integer menuType;
    private Integer menuParent;
    private Integer menuIndex;
    private String menuFoward;
    private String keyCode;
    private String buttonType;
    private String menuKey;
    private Integer createman;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private Integer lastalterman;
    private Integer status;
    private String remark;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "menu_id", nullable = false)
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
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
    @Column(name = "menu_type", nullable = true)
    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    @Basic
    @Column(name = "menu_parent", nullable = true)
    public Integer getMenuParent() {
        return menuParent;
    }

    public void setMenuParent(Integer menuParent) {
        this.menuParent = menuParent;
    }

    @Basic
    @Column(name = "menu_index", nullable = true)
    public Integer getMenuIndex() {
        return menuIndex;
    }

    public void setMenuIndex(Integer menuIndex) {
        this.menuIndex = menuIndex;
    }

    @Basic
    @Column(name = "menu_foward", nullable = true, length = 200)
    public String getMenuFoward() {
        return menuFoward;
    }

    public void setMenuFoward(String menuFoward) {
        this.menuFoward = menuFoward;
    }

    @Basic
    @Column(name = "key_code", nullable = true, length = 100)
    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    @Basic
    @Column(name = "button_type", nullable = true, length = 50)
    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    @Basic
    @Column(name = "menu_key", nullable = true, length = 50)
    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    @Basic
    @Column(name = "createman", nullable = true)
    public Integer getCreateman() {
        return createman;
    }

    public void setCreateman(Integer createman) {
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
    @Column(name = "lastalterman", nullable = true)
    public Integer getLastalterman() {
        return lastalterman;
    }

    public void setLastalterman(Integer lastalterman) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbWeixinMenu that = (TbWeixinMenu) o;
        return menuId == that.menuId &&
                Objects.equals(menuName, that.menuName) &&
                Objects.equals(menuType, that.menuType) &&
                Objects.equals(menuParent, that.menuParent) &&
                Objects.equals(menuIndex, that.menuIndex) &&
                Objects.equals(menuFoward, that.menuFoward) &&
                Objects.equals(keyCode, that.keyCode) &&
                Objects.equals(buttonType, that.buttonType) &&
                Objects.equals(menuKey, that.menuKey) &&
                Objects.equals(createman, that.createman) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(lastaltertime, that.lastaltertime) &&
                Objects.equals(lastalterman, that.lastalterman) &&
                Objects.equals(status, that.status) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, menuName, menuType, menuParent, menuIndex, menuFoward, keyCode, buttonType, menuKey, createman, createtime, lastaltertime, lastalterman, status, remark);
    }
}
