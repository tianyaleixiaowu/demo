package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;

/**
 * 公告
 *
 * @author wuweifeng wrote on 2018/11/16.
 */
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class PtNotice extends BaseEntity {
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 图片
     */
    private String pics;

    @Override
    public String toString() {
        return "PtNotice{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", pics='" + pics + '\'' +
                '}';
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
