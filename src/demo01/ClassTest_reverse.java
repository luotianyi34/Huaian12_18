package demo01;

import java.util.Scanner;


public class ClassTest_reverse {
    public static void main(String[] args) {
        //反转字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = scanner.nextLine();
        System.out.println(s+"反转后："+reverse(s));

    }
    public static String reverse(String s){
        String ss ="";
        char[] chs = s.toCharArray();
        for (int i = chs.length-1; i >=0 ; i--) {
            ss+=chs[i];
        }
        return ss;
    }
}
