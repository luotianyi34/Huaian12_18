package demo01;

public class demo extends Object{
    //Object 类 超类 是所有类的默认父类

    //finalize()
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        UserInfo userInfo2 = new UserInfo();
        UserInfo userInfo3 = userInfo;
        userInfo.setName("张三");
        System.out.println(userInfo.hashCode());
        userInfo2.setName("张三");
        userInfo3.setName("李四");
        String name = userInfo3.getName();
        System.out.println(name);
        System.out.println(userInfo2.hashCode());
        System.out.println(userInfo3.hashCode());
        System.out.println(userInfo2.equals(userInfo));
        System.out.println(userInfo3.equals(userInfo));
        Number n = 0;
        Class<? extends Number> c = n.getClass();

        //比较两个对象是否相等的时候 gethashCode();方法 两个引用对象如果get的值是一致的，那么，就说这两个对象相等（物理地址）

        //equals方法 比的是值相同（物理地址的值）

    }
}
