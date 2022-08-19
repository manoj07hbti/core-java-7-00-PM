package oops.inheritance;

public class B extends A {


    public static void main(String[] args) {

        B obj= new B();

        obj.m1();
        obj.m2();

        System.out.println("Printing data "+obj.name);
        System.out.println("Printing data "+obj.age);
    }
}
