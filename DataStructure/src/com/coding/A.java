package com.coding;

public class A {
    public void m1(){
        System.out.println("parent called");
    }

    public  void call(Object obj)
    {
        System.out.println("Object called");

    }
    public  void call(String obj)
    {
        System.out.println("String  called");

    }
}

class B extends  A{
    public void m1(){
        System.out.println("child called");
    }

    public static void main(String[]args){
    A a=new A();
    a.m1();
   // a.call(null);
    }
}
