package com.zpc.videoshow.pojo;

import java.io.Serializable;

public class VideoType implements Serializable {
    private Integer id;

    private String typeName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    @Override
    public String toString() {
        return "VideoType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}