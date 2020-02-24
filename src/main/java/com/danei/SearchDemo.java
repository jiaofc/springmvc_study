package com.danei;

import java.util.Arrays;

public class SearchDemo {
    public static void main(String[] args) {
        int [] data = new int[10];
        for (int k=0;k<data.length-1;k++){
            data[k] = k+1;
        }
        data[9]=6;
//        System.out.println(Arrays.toString(data));
        result(data);
    }
    public static void result(int data[]){
        Arrays.sort(data);
//        System.out.println(Arrays.toString(data));
        for(int i=0;i<data.length;i++){
            int target = data[i];
            data[i] = 0;
            int result  = binanyBind(data,target);
            if(result!=-1){
                System.out.println("相同的数字为"+data[result]);
            }
        }
    }

    public static int binanyBind(int data[], int target){
        int start = 0;
        int end = data.length-1;
        System.out.println(Arrays.toString(data));
        while (start<=end){
            int middleIndex = (start+end)/2;
            System.out.println("数值为："+target+"中间位置索引："+middleIndex+"中间值为："+data[middleIndex]);
            if(target==data[middleIndex]){
                return middleIndex;
            }else if(target>=data[middleIndex]){
                start = middleIndex+1;
            }else {
                end = middleIndex-1;
            }
        }
        return -1;
    }

}
