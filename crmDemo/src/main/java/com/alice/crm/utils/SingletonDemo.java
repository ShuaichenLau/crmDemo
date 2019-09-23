package com.alice.crm.utils;

public class SingletonDemo {

    private static SingletonDemo singletonDemo;

    private SingletonDemo(){}

    public synchronized static SingletonDemo getInstance(){
        if(singletonDemo == null){
            synchronized (SingletonDemo.class){
                if(singletonDemo == null){
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }


    public static void main(String[] args) {
        SingletonDemo instance1 = SingletonDemo.getInstance();
        SingletonDemo instance2 = SingletonDemo.getInstance();
        SingletonDemo instance3 = SingletonDemo.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}
