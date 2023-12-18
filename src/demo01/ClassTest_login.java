package demo01;

import java.util.Scanner;

public class ClassTest_login {
    public static void main(String[] args) {
        //模拟登录功能
        String username = "admin";
        String userpassword = "admin";
        //用键盘输入数据
        for (int i = 0; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请您登录，输入用户名：");
            String name = scanner.nextLine();
            System.out.println("请输入密码：");
            String password = scanner.nextLine();

            if (username.equals(name)&&userpassword.equals(password)){
                System.out.println("登录成功！");
                break;
            }else {
                if (i==3){
                    System.out.println("失败次数过多！用户已冻结");
                    break;
                }else {
                    System.out.println("用户名或密码输入错误！您还有"+(3-i)+"次机会！");
                }
            }
        }
    }
}
