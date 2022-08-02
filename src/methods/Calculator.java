package methods;

public class Calculator {

    public void add(){

        int a=3;
        int b=20;

        int result= a+b;
        System.out.println("Addition of a and b is : "+result);

    }

    // SUB a-b


    public void divide(){

        int a=9;
        int b=2;
        double result=(double) a/b;
        System.out.println("Division of given number is "+result);
    }

// multi  a*b
    public static void main(String[] args) {

        //step 1 create object
        Calculator obj= new Calculator();
        obj.add();// step 2 obj.methodName();
        obj.divide();
    }
}
