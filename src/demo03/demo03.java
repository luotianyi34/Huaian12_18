package demo03;

import org.junit.Test;

public class demo03 {
    //选择排序 找到序列中最大、最小的 放到序列的开头 ，反复循环执行操作 直到元素都被找完
    @Test
    public void getSelectionSort(){
        int[] arr = {1,-10,4,5,3,5};
        for (int i = 0; i < arr.length; i++) {
            //嵌套双层for循环 遍历arr.length次 找出所有元素
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i]<arr[j]){//初始时候默认最前面的数组为最大值，若后面数组有比它大的则交换位置
                    int a = arr[i]; //将最大值放入最前面的数组，被换下来的数放入最大值之前的数组
                    arr [i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");//遍历打印出arr数组的内容
        }
    }
}
