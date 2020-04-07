package com.learn.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class SellTicket {
    public static void main(String[] args) {
      Ticket t1=new Ticket();
      Thread thread1=new Thread(t1);
      Thread thread2=new Thread(t1);
      thread1.start();
      thread2.start();

    }


    public static class Ticket implements Runnable{
        //private AtomicInteger mCount = new AtomicInteger();
       private int count=1;

        @Override
        public void run() {
            while (true) {
                synchronized (this) {
                    //int c = mCount.getAndIncrement();
                    System.out.println(Thread.currentThread().getName() + "这是卖出去的第" + count++ + "张票！！");
                    if (count >= 100) {
                        break;
                    }
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
