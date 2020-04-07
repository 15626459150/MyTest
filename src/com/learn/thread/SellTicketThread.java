package com.learn.thread;

public class SellTicketThread {
    public static void main(String[] args) {
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        myThread1.start();
        myThread2.start();

    }
    public static class MyThread extends Thread{
       static int count=1;
        @Override
        public void run() {
            super.run();
            while(true){
                if(count>=100){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"这是卖出去的第"+(count++)+"张票");
            }
        }
    }
}
