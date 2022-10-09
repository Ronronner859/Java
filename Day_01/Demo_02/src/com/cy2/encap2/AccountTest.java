package com.cy2.encap2;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("cycycy");
        account.setBalance(19);
        account.setPassward("111111");
        System.out.println("账户1："+account.info());

        Account account1 = new Account("cy",11,"222222");
        System.out.println("账户2"+account1.info());

    }
}
class Account{
    public String name;
    private int balance;
    private String passward;

    public Account() {
    }

    public Account(String name, int balance, String passward) {
//        this.name = name;
//        this.balance = balance;
//        this.passward = passward;
        this.setName(name);
        this.setBalance(balance);
        this.setPassward(passward);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2 && name.length()<=4){
            this.name = name;
        }else {
            System.out.println("不符合规定！");
            this.name = "cy";
        }

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance>20){
            this.balance = balance;
        }else {
            System.out.println("no");
            this.balance = 21;
        }

    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        if (passward.length()==6)
        {
            this.passward = passward;
        }else {
            System.out.println("no");
        }

    }
    public String info(){
        return "信息："+ "name="+name+"  balance="+balance+"  passward="+passward;
        //也可以增加权限的校验
//        if (){
//            return "信息："+ "name="+name+"  balance="+balance+"  passward="+passward;
//        }else {
//            no
//        }
    }
}