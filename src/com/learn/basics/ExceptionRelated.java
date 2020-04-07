package com.learn.basics;

import javax.swing.*;

public class ExceptionRelated {
    public static void main(String[] args) {


//        try {
//            div(10, 0);
//            System.out.print("error");
//        } catch (ArithmeticException e) {
//            System.out.println("除数为0");
//        }

        Person p = new Person();
        p.setAge(-18);
        System.out.println(p.getAge());

    }

    public static int div(int a, int b) {
        return a / b;
    }


    static class Person {
        private String name;
        private int age;


        public Person() {
            super();

        }

        public Person(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0 && age < 150) {
                this.age = age;
            } else {
                System.out.println("年龄非法");
            }

        }


    }

}
