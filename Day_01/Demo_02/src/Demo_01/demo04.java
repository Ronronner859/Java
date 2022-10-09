package Demo_01;

public class demo04 {
    public static void main(String[] args) {
        new test().count();
        new test().count();
        System.out.println(test.count);
    }
}
 class test{
    public static int count  = 9;
    public void count(){
        System.out.println("count=："+(count++));
    }
}
//类变量和类方法 ：
/*
    1.静态方法：只能访问静态方法
    2.非静态方法：所有都能访问
    3.访问权限

 */