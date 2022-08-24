package oops.polymorphism;

public class MethodOverLoading {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void m1(){
        System.out.println("This is M1 method with no parameter ...");
    }

    // overload m1 by changing input parameter
    public void m1(int age){
        System.out.println("This is M1 method with no parameter ..."+age);
    }

    // overload m1 AGAIN
    public void m1(int age, String name){
        System.out.println("This is M1 method with no parameter ..."+age +" Name: "+name);
    }


    public static void main(String[] args) {
        MethodOverLoading obj= new MethodOverLoading();
        obj.m1();
        obj.m1(23);
        obj.m1(33,"Java");
    }
}
