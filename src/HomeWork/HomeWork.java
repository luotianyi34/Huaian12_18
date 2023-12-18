package HomeWork;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {
/*
    100以内随机出25个数，封装成数组A，排序（选择排序）
    再随机出5个数，如果这5个数组成数组B，在A数组中存在，（二分搜索)
    就删除，如果不存在将这个数*2再次查找，找到也删除(string buffer）删除后的数组重新排序小->大
*/

    public static void main(String[] args) {
        int[] a = new int[25];
        int[] b = new int[5] ;
        a=random(a);//初始化a
        b=random(b);//初始化b
        a=select(a);//将a用选择排序 从小到大排列
        System.out.println("数组A中的数字如下所示:");
        System.out.println(print(a));
        System.out.println("数组B中的数字如下所示:");
        System.out.println(print(b));
        //查找b中的值是否在a中存在，若存在则删除 若不存在则将b中的数字*2再次判断
        StringBuffer stringBufferA = new StringBuffer(print(a));//先将数组a转换为StringBuffer
        int index = -1;
        for (int i = 0; i < b.length; i++) {
            if (binarySearch(a,b[i])){
                if (b[i]<10){
                    while(stringBufferA.indexOf(" "+b[i]+" ")!=-1){
                        index = stringBufferA.indexOf(b[i]+" ");
                        stringBufferA.delete(index,index+2);//若为一位数则去除两个字符
                    }
                }else if (b[i]==100){
                    while(stringBufferA.indexOf(" "+b[i]+" ")!=-1){
                        index = stringBufferA.indexOf(b[i]+" ");
                        stringBufferA.delete(index,index+4);//若为三位数则去除四个字符
                    }
                }else {
                    while(stringBufferA.indexOf(" "+b[i]+" ")!=-1){
                        index = stringBufferA.indexOf(b[i]+" ");
                        stringBufferA.delete(index,index+3);//若为二位数则去除三个字符
                    }
                }
            }else {
                if (binarySearch(a,(b[i]*2))){//再次判断
                    if ((b[i]*2)<10){
                        while(stringBufferA.indexOf(" "+b[i]*2+" ")!=-1){
                            index = stringBufferA.indexOf(b[i]*2+" ");
                            stringBufferA.delete(index,index+2);//若为一位数则去除两个字符
                        }
                    }else if ((b[i]*2)==100){
                        while(stringBufferA.indexOf(" "+b[i]*2+" ")!=-1){
                            index = stringBufferA.indexOf(b[i]*2+" ");
                            stringBufferA.delete(index,index+4);//若为三位数则去除四个字符
                        }
                    }else {
                        while(stringBufferA.indexOf(" "+b[i]*2+" ")!=-1){
                            index = stringBufferA.indexOf(b[i]*2+" ");
                            stringBufferA.delete(index,index+3);//若为二位数则去除三个字符
                        }
                    }
                }else {
                    System.out.println("数组B中的"+b[i]+"不匹配规则");//展示不匹配规则的数字
                }
            }
        }
        System.out.println("删除目标数字后展现如下:");
        System.out.println(stringBufferA);//展现移除后的数组
    }
    public static int[] random(int[] a){
        //生成随机数
        Random random = new Random();
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i]= random.nextInt(100)+1;
        }
        return arr;
    }
    public static String print(int[] a){
        //将数组a转变为字符串类型并规范化格式
        String save = " ";
        for (int i = 0; i < a.length; i++) {
                save += a[i]+" ";
        }
        return save;
    }
    public static int[] select(int[] a){
        for (int i = 0; i < a.length; i++) {
            //嵌套双层for循环 遍历arr.length次 找出所有元素
            for (int j = 1 + i; j < a.length; j++) {
                if (a[i]> a[j]){//初始时候默认最前面的数组为最小值，若后面数组有比它小的则交换位置
                    int mid = a[i]; //将最小值放入最前面的数组，被换下来的数放入最小值之前的数组
                    a[i] = a[j];
                    a[j] = mid;
                }
            }
        }
        return a;
    }
    public static boolean binarySearch(int[] a,int key){
        //二分查询
        int min = 0;
        int mid = 0;
        int max = a.length-1;
        while (min<=max){
            mid = (min+max)/2;
            if (key>a[mid]){
                min = mid+1;
            }else if(key<a[mid]){
                max = mid-1;
            }else {
                return true;//若查找正确则返回true
            }
        }
        return false;//若查找不到则返回false
    }
}
