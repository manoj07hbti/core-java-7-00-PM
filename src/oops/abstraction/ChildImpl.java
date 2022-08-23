package oops.abstraction;

public class ChildImpl implements DemoInterfaceExample{

    @Override
    public void m1() {
      System.out.println("This is m1");
    }

    @Override
    public void m2() {
        System.out.println("This is m2");
    }

    @Override
    public void m3() {
        System.out.println("This is m3");
    }

    public static void main(String[] args) {
        ChildImpl obj= new ChildImpl();
        obj.m1();
        obj.m2();
        obj.m3();

    }
}
