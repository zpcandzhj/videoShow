package com.zpc.videoshow.controller.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // 获得事件源对象
        HttpSession session = se.getSession();
        System.out.println(session.getId() + "对应session被创建了...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // 获得事件源对象
        HttpSession session = se.getSession();
        System.out.println(session.getId() + "对应session被销毁了...");
    }

}