package com.zpc.videoshow.controller.listener;

public class PersonEvent {private Object source;

    // 创建产生事件对象时，传递事件源对象给 事件对象
    public PersonEvent(Object source) {
        this.source = source;
    }

    // 获得事件源
    public Object getSource() {
        return source;
    }

}
