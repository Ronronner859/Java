package Demo_01;

public class demo1 {
    public static void main(String[] args) {
        child child1= new child("x");
        child1.join();
        child1.count++;
        child child2= new child("y");
        child2.join();
        child2.count++;
        child child3= new child("z");
        child3.join();
        child3.count++;
        System.out.println("有"+child.count+"个人加入了游戏...");



    }
}
class child {
    private String name;
    //静态变量被对象共享（同一个类中）
    //在类加载的时候就生成
    public static int count = 0;//定义的共享的类变量
    public child(String name){
        this.name = name;
    }

    public void  join(){
        System.out.println(name + "加入了游戏...");
    }
}
