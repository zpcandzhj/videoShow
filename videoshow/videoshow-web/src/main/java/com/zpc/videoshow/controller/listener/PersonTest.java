package com.zpc.videoshow.controller.listener;

public class PersonTest {
    public static void main(String[] args) {
        // 1、创建事件源
        Person person = new Person();
        person.setName("小明");
        person.setWeight(120);

        // 2、创建监听器对象
        PersonListener personListener = new PersonListener() {
            @Override
            public void personEating(PersonEvent personEvent) {
                System.out.println("监听到 人在吃....");
                // 在监听器内部，获得事件对象，事件对象获得事件源对象
                Person p = (Person) personEvent.getSource();
                System.out.println("吃东西的人是：" + p.getName() + ", 监听到体重变为: "
                        + p.getWeight());
            }
        };

        // 3、注册监听器
        person.addPersonListener(personListener);

        // 4、操作事件源
        person.eat();
    }
}
