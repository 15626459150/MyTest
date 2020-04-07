package com.learn.basics;
/*
* 1.Integer integer1=12 自动装箱调用Integer.valueOf()方法，-128-127之间的数会直接从缓存中取出来，超过这个范围的数会新建一个Integer对象
* 2.==和equals的区别：
* 基本类型而言，均是比较数值是否相等，引用类型而言equals比较内存地址,但是String类除外，因为它重写了equals方法，不比较内存地址，比较string文本
* */
public class Boxing {
    public static void main(String[] args) {
        compare();
    }
    public static void compare(){
        Integer integer1=12;
        Integer integer2=12;
        Integer integer3=200;
        Integer integer4=Integer.valueOf(200);
        System.out.println(integer1==integer2);
        System.out.println(integer3==integer4);
        System.out.println(integer3.equals(integer4));
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
