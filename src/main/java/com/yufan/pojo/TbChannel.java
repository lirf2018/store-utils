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
@Table(name = "tb_channel", schema = "store_db", catalog = "")
public class TbChannel {
    private int channelId;
    private String channelCode;
    private String channelName;
    private String createman;
    private Timestamp createtime;
    private Timestamp lastaltertime;
    private String lastalterman;
    private Integer status;
    private String remark;
    private Integer shopId;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name = "channel_id", nullable = false)
    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "channel_code", nullable = true, length = 20)
    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Basic
    @Column(name = "channel_name", nullable = true, length = 40)
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
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
        TbChannel tbChannel = (TbChannel) o;
        return channelId == tbChannel.channelId &&
                Objects.equals(channelCode, tbChannel.channelCode) &&
                Objects.equals(channelName, tbChannel.channelName) &&
                Objects.equals(createman, tbChannel.createman) &&
                Objects.equals(createtime, tbChannel.createtime) &&
                Objects.equals(lastaltertime, tbChannel.lastaltertime) &&
                Objects.equals(lastalterman, tbChannel.lastalterman) &&
                Objects.equals(status, tbChannel.status) &&
                Objects.equals(remark, tbChannel.remark) &&
                Objects.equals(shopId, tbChannel.shopId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, channelCode, channelName, createman, createtime, lastaltertime, lastalterman, status, remark, shopId);
    }
}
