package Demo_01;

public class demo02 {
    public static void main(String[] args) {
        System.out.println(a.name);
        a a = new a();
        System.out.println(a.name);


    }
}
class a{
    //类变量 ：随着类的加载而创建的，就是没有创建对象时也可以访问 通过类名.类变量名实现
    //生命周期随着类的加载而加载的
    //也要遵守访问规则
    public static String name  = "helloworld!";

    /*
    *  1.什么时候需要类变量：
    *       某个类的对象都要运用到该变量时
    *  2.类变量和实例变量的区别
    *
    *  静态变量、非静态变量
    * */

}
