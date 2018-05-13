package com.zpc.videoshow.controller.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request对象被销毁...");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("产生一次新的请求 request...");
    }

}