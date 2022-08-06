package methods;

import java.util.Scanner;

public class CalculatorApp {

    // addition

    public int addition(int a, int b){

        int sum=a+b;

        return sum;
    }

    public int subtraction(int a, int b){

        int sub=a-b;

        return sub;
    }


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);




        CalculatorApp obj= new CalculatorApp();

        String flag="Y";

        while(flag.equals("Y")){


            System.out.println("Please enter your choice : 1-Add, 2-Sub, 3-Multi and 4-Divide");
            int choice= scanner.nextInt();

            System.out.println("Please enter value of a :");
            int a= scanner.nextInt();// reads integer value

            System.out.println("Please enter value of b :");

            int b= scanner.nextInt();

            if(choice==1){
                int result= obj.addition(a,b);
                System.out.println("Addition is "+result);
            }
            else if(choice==2){
                int result=obj.subtraction(a,b);
                System.out.println("Subtraction is "+result);

            }

            System.out.println("Please press Y to continue Calc or press any button to exit");
            Scanner scanner2= new Scanner(System.in);
            flag=scanner2.nextLine();
        }







    }
}
