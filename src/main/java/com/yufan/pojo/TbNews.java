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
@Table(name = "tb_news", schema = "store_db", catalog = "")
public class TbNews {
    private int newsId;
    private String newsTitle;
    private String contents;
    private Integer status;
    private Integer isRead;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String createman;
    private Integer userId;
    private Integer shopId;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "news_id", nullable = false)
    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    @Basic
    @Column(name = "news_title", nullable = true, length = 255)
    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    @Basic
    @Column(name = "contents", nullable = true, length = 800)
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
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
    @Column(name = "is_read", nullable = true)
    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
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
    @Column(name = "createman", nullable = true, length = 255)
    public String getCreateman() {
        return createman;
    }

    public void setCreateman(String createman) {
        this.createman = createman;
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
        TbNews tbNews = (TbNews) o;
        return newsId == tbNews.newsId &&
                Objects.equals(newsTitle, tbNews.newsTitle) &&
                Objects.equals(contents, tbNews.contents) &&
                Objects.equals(status, tbNews.status) &&
                Objects.equals(isRead, tbNews.isRead) &&
                Objects.equals(createtime, tbNews.createtime) &&
                Objects.equals(lastaltertime, tbNews.lastaltertime) &&
                Objects.equals(createman, tbNews.createman) &&
                Objects.equals(userId, tbNews.userId) &&
                Objects.equals(shopId, tbNews.shopId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, newsTitle, contents, status, isRead, createtime, lastaltertime, createman, userId, shopId);
    }
}
