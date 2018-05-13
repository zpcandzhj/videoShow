package com.zpc.videoshow.pojo;

import java.io.Serializable;

public class VideoInfo implements Serializable {
    private Integer id;

    private String videoName;

    private String videoCoverPath;

    private String videoHtmlUrl;

    private Integer videoType;

    private Integer videoShowFlag;

    private String typeName;

    private static final long serialVersionUID = 1L;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoCoverPath() {
        return videoCoverPath;
    }

    public void setVideoCoverPath(String videoCoverPath) {
        this.videoCoverPath = videoCoverPath == null ? null : videoCoverPath.trim();
    }

    public String getVideoHtmlUrl() {
        return videoHtmlUrl;
    }

    public void setVideoHtmlUrl(String videoHtmlUrl) {
        this.videoHtmlUrl = videoHtmlUrl == null ? null : videoHtmlUrl.trim();
    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public Integer getVideoShowFlag() {
        return videoShowFlag;
    }

    public void setVideoShowFlag(Integer videoShowFlag) {
        this.videoShowFlag = videoShowFlag;
    }

    @Override
    public String toString() {
        return "VideoInfo{" +
                "id=" + id +
                ", videoName='" + videoName + '\'' +
                ", videoCoverPath='" + videoCoverPath + '\'' +
                ", videoHtmlUrl='" + videoHtmlUrl + '\'' +
                ", videoType=" + videoType +
                ", videoShowFlag=" + videoShowFlag +
                '}';
    }
}