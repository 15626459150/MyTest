package com.learn.thread;

public class Synchronized {
    public static void main(String[] args) {
        Mythread mythread1=new Mythread();
        Mythread mythread2=new Mythread();
        Thread thread1=new Thread(mythread1);
        Thread thread2=new Thread(mythread2);
        thread1.start();
        thread2.start();


    }


   public static class Mythread implements  Runnable{
   int count=0;
       @Override
       public void run() {
           synchronized (this){
               for (int i = 0; i <5 ; i++) {
                   System.out.println(Thread.currentThread().getName()+"count的值是"+count++);
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

           }
       }
   }
}
