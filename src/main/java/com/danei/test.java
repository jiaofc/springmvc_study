package com.danei;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jiaofucheng
 * 2020 -02 -05 -下午3:27
 */
public class test {

    private int a;

    /*public static void main(String[] args) {
        System.out.println("bangbang!!");
//        list.add();
        method();
        ArrayList arrayList = new ArrayList();
        return;

    }*/

    public static void method() {
        try {
            //region Description
            tesss();
            //endregion
        } finally {

        }
    }

    public static void tesss() {
        int a = 0;
    }
//模版六 prsf
    private static final int num=10;
    //变形 psf
    public static final int num1=0;
    //变形 psfi/psfs
    public static final int num2 = 0;
    public static final String ss="0";

//模版一：psvm
    public static void main(String[] args) {
//模版二：sout
        System.out.println();
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("test.main");//打印方法名
        int num1=10;
        System.out.println("num = " + num1);//打印变量
        int num2=20;
        System.out.println("num2 = " + num2);//就近打印变量num2
        //num1.sout
        System.out.println(num1);

//模版三 fori
        String[] arr = new String[]{"Jerry",null,"arr","Lady"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }
//模版四 list.for
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(111);
        integerArrayList.add(222);
        integerArrayList.add(333);
        //list.for 增强for循环
        for (Integer integer : integerArrayList) {
            System.out.println("integer = " + integer);
        }
        //变形 list.fori 普通for循环
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i));
        }
        //变形 list.forr   return倒叙for循环
        for (int i = integerArrayList.size() - 1; i >= 0; i--) {
            System.out.println(integerArrayList.get(i));
        }
//模版五 ifn
        if (integerArrayList == null) {

        }
        //变形 inn
        if (integerArrayList != null) {

        }
        //变形 xxx.null/xxx.nn
        if (integerArrayList == null) {

        }
        //变形 xxx.nn
        if (integerArrayList != null) {

        }
    }
}


