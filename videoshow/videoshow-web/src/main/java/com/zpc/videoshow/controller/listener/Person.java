package com.zpc.videoshow.controller.listener;

public class Person {
    private String name;
    private int weight;

    // 监听器
    private PersonListener personListener;

    // 注册监听器（在事件源中提供）
    public void addPersonListener(PersonListener personListener) {
        this.personListener = personListener;
    }

    // 被监听的方法
    public void eat() {
        // 该方法执行，事件源发生改变
        System.out.println(this.name + "吃了肯德基");
        weight += 5;

        // 产生事件对象
        PersonEvent personEvent = new PersonEvent(this);
        // 将事件传递给监听器
        if (personListener != null) {
            personListener.personEating(personEvent);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}