package com.tenghang.java;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;


// 主函数部分
public class user_test {
    public user_test() {
    }

    public static void main(String[] args){

        System.out.println("hello world user test");
        ArrayList listhelllo = new ArrayList();
        test1();

        Date date = new Date();
        listhelllo.add(1);


    }

    public static void test1(){

        System.out.println("test01");

    }

    public static void test2(){

        System.out.println("test02");

        ArrayList list = new ArrayList();

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


