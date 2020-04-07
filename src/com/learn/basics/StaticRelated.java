package com.learn.basics;

public class StaticRelated {
    public static void main(String[] args) {
        test();
    }

   static{
        System.out.println("static block");
    }
    public static void test(){
        System.out.println("static method");
    }
}
