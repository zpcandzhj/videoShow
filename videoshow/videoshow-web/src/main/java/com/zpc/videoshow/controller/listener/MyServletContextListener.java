package com.zpc.videoshow.controller.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听servletContext对象创建...");
        // 获取被监听事件源对象
        ServletContext context = sce.getServletContext();

        // 启动定时器
        final Timer timer = new Timer();
        // 启动定时器 第一种方式
        // timer.schedule(new TimerTask() {
        //
        // @Override
        // public void run() {
        // System.out.println("定时器任务开始执行了...");
        // }
        // }, 0, 2000); // 立刻执行一个任务, 每隔2秒重复执行

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 10, 22, 15, 2, 0);
        // 启动定时器的第二种方式 指定时间执行
        timer.schedule(new TimerTask() {

            // 执行10次停止
            private int times;

            @Override
            public void run() {
                times++;
                System.out.println(times + " 定时器开始执行...." + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
                if (times == 10) {
                    // 取消定时器
                    timer.cancel();
                }
            }
        }, calendar.getTime(), 2000);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听servletContext对象销毁...");
    }
}
