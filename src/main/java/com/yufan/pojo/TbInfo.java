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
@Table(name = "tb_info", schema = "store_db", catalog = "")
public class TbInfo {
    private int infoId;
    private String infoTitle;
    private String infoImg;
    private String infoUrl;
    private String infoContent;
    private Integer status;
    private Integer shopId;
    private Integer infoIndex;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer readCount;
    private Timestamp startTime;
    private Timestamp endTime;
    private String markMsg;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "info_id", nullable = false)
    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    @Basic
    @Column(name = "info_title", nullable = true, length = 100)
    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    @Basic
    @Column(name = "info_img", nullable = true, length = 100)
    public String getInfoImg() {
        return infoImg;
    }

    public void setInfoImg(String infoImg) {
        this.infoImg = infoImg;
    }

    @Basic
    @Column(name = "info_url", nullable = true, length = 100)
    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    @Basic
    @Column(name = "info_content", nullable = true, length = -1)
    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
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
    @Column(name = "shop_id", nullable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "info_index", nullable = true)
    public Integer getInfoIndex() {
        return infoIndex;
    }

    public void setInfoIndex(Integer infoIndex) {
        this.infoIndex = infoIndex;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "read_count", nullable = true)
    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
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
    @Column(name = "mark_msg", nullable = true, length = 100)
    public String getMarkMsg() {
        return markMsg;
    }

    public void setMarkMsg(String markMsg) {
        this.markMsg = markMsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbInfo tbInfo = (TbInfo) o;
        return infoId == tbInfo.infoId &&
                Objects.equals(infoTitle, tbInfo.infoTitle) &&
                Objects.equals(infoImg, tbInfo.infoImg) &&
                Objects.equals(infoUrl, tbInfo.infoUrl) &&
                Objects.equals(infoContent, tbInfo.infoContent) &&
                Objects.equals(status, tbInfo.status) &&
                Objects.equals(shopId, tbInfo.shopId) &&
                Objects.equals(infoIndex, tbInfo.infoIndex) &&
                Objects.equals(createTime, tbInfo.createTime) &&
                Objects.equals(updateTime, tbInfo.updateTime) &&
                Objects.equals(readCount, tbInfo.readCount) &&
                Objects.equals(startTime, tbInfo.startTime) &&
                Objects.equals(endTime, tbInfo.endTime) &&
                Objects.equals(markMsg, tbInfo.markMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoId, infoTitle, infoImg, infoUrl, infoContent, status, shopId, infoIndex, createTime, updateTime, readCount, startTime, endTime, markMsg);
    }
}
