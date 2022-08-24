package oops.polymorphism;

public class Child extends MethodOverriding {

    public void m1(){

        System.out.println("This is m1 from CHILD class..");
    }

    public void m2(){

        System.out.println("This is m2 from CHILD class..");
    }

    public static void main(String[] args) {

        MethodOverriding obj= new MethodOverriding();
        obj.m1(); // called parent method

        MethodOverriding obj1= new Child();
        obj1.m1(); // called child method

        // whatever object is getting created it will call that class method only

        // It will give Compile time error
        //Child obj2= new MethodOverriding(); // we can not store parent object in Child reference variable
        //obj2.m1();

    }
}
