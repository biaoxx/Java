package com.biao.learn.learn_01_thread;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();

        t1.start();
        t2.start();
    }

}
