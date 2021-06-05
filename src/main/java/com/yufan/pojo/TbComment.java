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
@Table(name = "tb_comment", schema = "store_db", catalog = "")
public class TbComment {
    private int commentId;
    private Integer userId;
    private String phone;
    private Integer goodsId;
    private String content;
    private Integer score;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private String img6;
    private Integer isShow;
    private String createman;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
    private Integer status;
    private String remark;
    private Integer shopId;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "comment_id", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 15)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "goods_id", nullable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "score", nullable = true)
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "img1", nullable = true, length = 200)
    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    @Basic
    @Column(name = "img2", nullable = true, length = 200)
    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    @Basic
    @Column(name = "img3", nullable = true, length = 200)
    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    @Basic
    @Column(name = "img4", nullable = true, length = 200)
    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    @Basic
    @Column(name = "img5", nullable = true, length = 200)
    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5;
    }

    @Basic
    @Column(name = "img6", nullable = true, length = 200)
    public String getImg6() {
        return img6;
    }

    public void setImg6(String img6) {
        this.img6 = img6;
    }

    @Basic
    @Column(name = "is_show", nullable = true)
    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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
        TbComment tbComment = (TbComment) o;
        return commentId == tbComment.commentId &&
                Objects.equals(userId, tbComment.userId) &&
                Objects.equals(phone, tbComment.phone) &&
                Objects.equals(goodsId, tbComment.goodsId) &&
                Objects.equals(content, tbComment.content) &&
                Objects.equals(score, tbComment.score) &&
                Objects.equals(img1, tbComment.img1) &&
                Objects.equals(img2, tbComment.img2) &&
                Objects.equals(img3, tbComment.img3) &&
                Objects.equals(img4, tbComment.img4) &&
                Objects.equals(img5, tbComment.img5) &&
                Objects.equals(img6, tbComment.img6) &&
                Objects.equals(isShow, tbComment.isShow) &&
                Objects.equals(createman, tbComment.createman) &&
                Objects.equals(createtime, tbComment.createtime) &&
                Objects.equals(lastaltertime, tbComment.lastaltertime) &&
                Objects.equals(lastalterman, tbComment.lastalterman) &&
                Objects.equals(status, tbComment.status) &&
                Objects.equals(remark, tbComment.remark) &&
                Objects.equals(shopId, tbComment.shopId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, userId, phone, goodsId, content, score, img1, img2, img3, img4, img5, img6, isShow, createman, createtime, lastaltertime, lastalterman, status, remark, shopId);
    }
}
