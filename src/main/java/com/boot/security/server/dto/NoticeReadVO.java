package com.boot.security.server.dto;

import java.util.Date;

import com.boot.security.server.model.Notice;

/**
 * 公告值对象
 *
 * @author yehaibo  2020/10/10
 */
public class NoticeReadVO extends Notice {

    private static final long serialVersionUID = -3842182350180882396L;

    private Long userId;
    private Date readTime;
    private Boolean isRead;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * 重写tostring方法
     **/
    @Override
    public String toString() {
        return "NoticeReadVO{userId=" + userId + ", readTime=" + readTime + ", isRead=" + isRead + "}";
    }

}
