package demo01;

public class ClassTest_find {
    public static void main(String[] args) {
        String s = "woaijavawoaijavawoaijavawoaijava";
        System.out.println(getCount(s, "java"));
    }
    public static int getCount(String bigStr, String smallStr) {
        int count = 0; // 出现小串的次数
        int index = -1;// 出现小串的位置
/**
 while 的循环条件三步骤：
 1. big.indexOf(small) 获取小串在大串中出现的位置
 2. 把小串出现的位置，赋值给变量 index
 3. 判断出现的位置是否为-1， 如果位置等于-1，说明大串中已经查询不到小
 串了；
 如果位置不等于-1，那么，进行循环，完成次数累加与修改大串的操作
 */
        while ((index = bigStr.indexOf(smallStr)) != -1) {
            count++;// 出现次数+1
            // 更改大串内容
            bigStr = bigStr.substring(index + 1);
        }
        return count;
    }
}
