package com.biao.learn.learn_01_thread;


/**
 * 1. 实现 Runnable, 的run方法
 * 2. 继承Thread类, 重写run方法
 *
 *
 */
public class ThreadDemo  extends Thread {
    private int[] ls = {1,3,4,5};
    @Override
    public void run()  {
        for(int i=0;i<=100000;i++){
            System.out.println("--"+i);
           /* try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }

    }
}
