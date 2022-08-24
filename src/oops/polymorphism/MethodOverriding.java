package oops.polymorphism;

public class MethodOverriding {

    public void m1(){

        System.out.println("This is m1 method of MethodOverriding Class");
    }
    public void m2(){

        System.out.println("This is m2 method of MethodOverriding Class");
    }


    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.m1();
    }

}
