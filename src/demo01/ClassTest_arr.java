package demo01;

import java.util.Scanner;

public class ClassTest_arr {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,3,4,5};
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
              s+=arr[i];
            }else {
                s+=arr[i]+",";
            }
        }
        s +="]";
        System.out.println(s);

    }
}
