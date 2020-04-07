package com.learn.thread;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {


//        MyThread thread1=new MyThread("Thread1");
//        MyThread thread2=new MyThread("Thread2");
//        Mythread2 mythread2=new Mythread2();
//        Thread thread=new Thread(mythread2);
//        thread1.start();
//        thread2.start();
//        thread.start();
//         for (int i=0;i<10;i++){
//
//             System.out.println("aaaaaaa");
//             Thread.sleep(100);
//        }

         Thread t1=new Thread(){
             @Override
             public void run() {
                 super.run();
                 this.setName("one");
                 for (int i=0;i<10;i++){
                     try {
                         sleep(100);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     System.out.println(this.getName()+"dddddd"+i);
                 }
             }
         };

         Thread t2=new Thread(new Runnable() {
             @Override
             public void run() {
                 Thread.currentThread().setName("two");
                 for (int i=0;i<10;i++){
                     if(i==2){
                         try {
                             t1.join();
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                     try {
                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     System.out.println("eeeeee"+i);
                 }
             }
         }){};
         t2.setDaemon(true);
         t1.start();
         t2.start();


    }

    public static class MyThread extends Thread{
        String name;
        public MyThread(String name){
            this.name=name;
        }
        @Override
        public void run() {
            super.run();
            for (int i=0;i<10;i++){
                System.out.println("bbbbbb"+name);
            }
        }
    }


    public static class Mythread2 implements Runnable{

        @Override
        public void run() {
            for (int i=0;i<10;i++){
                System.out.println("cccccc");
            }
        }
    }
}
