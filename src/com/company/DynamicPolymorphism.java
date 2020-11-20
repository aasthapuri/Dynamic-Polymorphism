package com.company;

public class DynamicPolymorphism {


    public static void main(String[] args) {

        Parent obj = new Parent();
        obj.show();
        Child obj1 = new Kid();
        obj1.show();
        obj1.Name();
    }
}
class Parent{
    void show(){
        System.out.println("Very First");
    }
    void Name(){
        System.out.println("First");
    }
}
class Child extends Parent{

    void show(){
        System.out.println("Second");
    }
    void Name(){
        System.out.println("Third");
    }
}
class Kid extends Child{
    void show(){
        System.out.println("Forth");
    }
}
