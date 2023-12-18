package demo01;

import java.util.Scanner;

public class ClassTest_total {
    public static void main(String[] args) {
        int bigCount=0;
        int smallCount=0;
        int numCount=0;
        int els = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String sc = scanner.nextLine();
        char[] chs = sc.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i]>='A'&&chs[i]<='Z'){
                bigCount++;
            }else if (chs[i]>='a'&&chs[i]<='z'){
                smallCount++;
            } else if (chs[i]>='0'&&chs[i]<='9') {
                numCount++;
            }else {
                els++;
            }
        }
        System.out.println("大写的个数"+bigCount);
        System.out.println("小写的个数"+smallCount);
        System.out.println("数字的个数"+numCount);
        System.out.println("其他符号的个数"+els);
    }
}
