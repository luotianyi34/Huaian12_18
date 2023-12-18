package demo02;

import org.junit.Test;

public class demo {
    /*StringBuffer
    *可变字符序列 用来封装，重组 String的一个容器 是对字符串的各种操作
    * append()方法 将字符串添加到目标字符串的结尾
    * delete()方法 根据下标删除字符串中指定位置的字符
    *       deleteCharAt(index);
    *       delete(start_index,end_index);//左边(start_index)不包含，右边(start_index)包含
    * insert(index,要插入的值)第几个长度
    * reverse()方法 将字符串反转
    *
    * StringBuffer与StringBulider的区别
    * StringBuffer 线程安全 但是按照步骤来 1->2->3->4->5
    * StringBulider 线程不安全 同步进行  同时进行12345 最后合并
    *
    *
    *
    * */
    @Test
    public void StringBufferTest(){
        String str = "abcdefg";
        StringBuffer stringBuffer =new StringBuffer(str);
        stringBuffer.append("ww");// str+="def";
        stringBuffer.append(true);
        stringBuffer.delete(1,3);

        String res = stringBuffer.toString();

        System.out.println(res);
    }

    @Test
    public void getInsert(){
        String str = "zhangsan";
        StringBuffer stringBuffer = new StringBuffer(str);
//        stringBuffer.insert(5,"xiao");
        stringBuffer.insert(str.length(),"fawaikuangtu");
        System.out.println(stringBuffer);
    }

    @Test
    public void getReverse(){

        StringBuffer stringBuffer = new StringBuffer("abcdef");
        stringBuffer.reverse();
        int a =1;
        String b = a+"";
        System.out.println(stringBuffer);

    }

    @Test
    public void getTest(){
        int[] arr = {2,11,5,7,20};
        //将上方的数组转成字符串
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1){
                stringBuffer.append(arr[i]).append(",");
            }else {
                stringBuffer.append(arr[i]).append("]");
            }
        }
        System.out.println(stringBuffer);
    }

}
