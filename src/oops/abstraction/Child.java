package oops.abstraction;

public class Child extends DemoAbstraction {

    @Override
    public void m1() {
        System.out.println("this is M1 from child class....");
    }

    public static void main(String[] args) {

        Child obj= new Child();
        obj.m1();
        obj.m1();
    }
}
