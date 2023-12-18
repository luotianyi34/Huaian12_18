package demo04;

import org.junit.Test;

public class demo04 {
    /* 搜索算法 二分搜索 对数搜索
    * 有序的集合先排序
    *
    *
    * 100以内随机出25个数，封装数组，排序（选择排序） 再随机出五个数字，如果这五个数字在a数组中存在就删除（string buffer）如果不存在将这个数字乘以2再次查找 找到依然删除 删除后的数组要重新排序(从小到大排序)
    * */

    @Test
    public void binarySearch(){
        int[] arr = {1,3,4,5,8,9,12,15,18};
        int min = 0 ;
        int max = arr.length-1 ; //最大长度
        int mid = 0 ;

        int key = 4;

        while(min<=max){
            mid =(min+max)/2;
            if (key>arr[mid]){
                min = mid+1;
            } else if (key<arr[mid]) {
                max = mid-1;
            }else {
                System.out.println("寻找的数字的下标为"+mid);
                break;
            }
        }


    }

}
