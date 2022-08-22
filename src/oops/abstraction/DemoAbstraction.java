package oops.abstraction;

public abstract class DemoAbstraction {

    // Syntax : access_specifier abstract return_type  method_name (parameter);

    //Abstract Class: a class which has at least one abstract method  or declared with abstract keyword

    // can we create object of abstract Class ?? NO , we can not create object of abstract class
    // reason: if we try to create object and call abstract method then JVM will not able to find method code which should
    // get executed

    // Child class override abstract method and use as per their requirement

    public abstract void m1(); // abstract method

    public void m2(){

        System.out.println("This is M2 Method ...");
    }

    public static void main(String[] args) {

      /*  DemoAbstraction obj = new DemoAbstraction();
        obj.m1();*/
    }
}
