package Demo_01;

public class demo03 {
    public static void main(String[] args) {
        m m = new m();
        m.fun1(100);
        m m1 = new m();
        m1.fun1(200);

        m.fun();
        //当方法中不涉及到任何和对象相关的成员，则可以将方法设计成静态方法，提高开发效率
        System.out.println(Math.sqrt(9));
        //求和工具类：直接调用 不同造对象例如：Math.sqrt(9)
        System.out.println(mytools.calsum(10,100));
        // 非静态方法不能通过类名调用 只能先创建对象再调用

        //口诀：静态方法只能访问静态成员
        //普通成员方法可以访问静态成员和非静态成员
    }
}
//开发自己的工具类的时候，可以将方法做成静态的，方便调用
class mytools{
    //静态方法：不用造对象就可以调用静态方法
    public static double calsum(double m1, double m2){
        return m1+m2;
    }
}
class mytool2{
    public double sum(double n1,double n2){
        return n1+n2;
    }
}
class m{
    public static int free = 0;



    public void fun1(int free){
         m.free+=free;
    }
    //静态方法
    public static void fun(){
        System.out.println("total:"+m.free);
    }

}