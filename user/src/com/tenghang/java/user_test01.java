package com.tenghang.java;

import java.util.ArrayList;

/**
 * @author WickedYoungster
 * @create 2019-12-10 下午4:38
 */


public class user_test01 {

    public static void main(String[] args) {




        System.out.println();
        int i = 1;
        String[] arr = new  String[]{"Tom", "Jerry", "Lilei"};

        // 模版一： for 循环
        // fori
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        // iter
        for (String s : arr) {
            System.out.println(s);
        }
        // itar
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            System.out.println(s);
        }
        // 模版二：list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.for 增强性 for循环
        for (Object o : list) {
            System.out.println(o);
        }

        // list.fori 顺序循环
        for (int i1 = 0; i1 < list.size(); i1++) {
            //
        }
        // list.forr  倒序循环
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            //
        }

        // 模板三：if not
        // ifn
        if (list == null) {
            System.out.println("");
        }
        // inn
        if (list != null) {
            System.out.println("");
        }




    }


    


}
