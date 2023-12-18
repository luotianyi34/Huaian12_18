package demo01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ClassTest_upcase {
    public static void main(String[] args) {
        //把字符串的首字母给大写，其余为小写
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要更改的字符串：");
        String s = scanner.nextLine();
        String s1 = s.substring(0,1);
        String s2 = s.substring(1);
        System.out.println("更改结果为："+s1.toUpperCase()+s2.toLowerCase());
    }

}
