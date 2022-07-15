package demo_variables;

public class VariableManipulation {

    public static void main(String[] args) {

        int a=11;
        int b=9;

        System.out.println("first number is "+a);
        System.out.println("Second number is "+b);

        // find square of given number : number*number

        int square=a*a;

        System.out.println("Square of a "+square);

        // SUM of two number a+b
        int sum=a+b;

        System.out.println("SUM of a and b is : "+sum);

        // subtraction of two number a-b
        int sub=a-b;
        System.out.println("Sub is :"+sub);

        // divide   a/b

        double divide=(double) a/b;

        System.out.println("Division os a and b is : "+divide);

        // increment operator ++  >  +1
        a++;
        System.out.println("++ Operator on a "+a);
        b++;
        System.out.println("++ Operator on b "+b);

        // decrement operator -- >  -1
        a--;
        System.out.println("-- Operator on a "+a);
        b--;
        System.out.println("-- Operator on b "+b);



    }
}
