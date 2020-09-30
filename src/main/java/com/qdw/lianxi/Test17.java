package com.qdw.lianxi;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test17
 * @Description:
 * @date: 2020/9/11 0011 23:03
 */
class A1{
    int a;
    public A1(){
        this.a = 1;
    }
    public void print(){
        System.out.println(a);
    }
}
class B1 extends A1 {
    int a;
    public B1(){
        this.a = 10;
    }

    public void printB(){
        System.out.println(a);
    }
}
public class Test17 {


    public static void main(String[] args) {
        A1 a = new B1();
        a.print();
        System.out.println(a.a);

        B1 b = new B1();
        b.print();
        b.printB();
        System.out.println(b.a);


    }
}
