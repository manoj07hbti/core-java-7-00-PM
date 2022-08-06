package scanner_demo;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // STEP 1 Create object of class

        Scanner obj= new Scanner(System.in);

        System.out.println("Please enter your name : ");

        String name=  obj.nextLine(); // it reads String input

        System.out.println("Entered name is : "+name);

        System.out.println("Please enter your Age : ");

        int age= obj.nextInt();// reads integer input
        System.out.println("Entered Age is  :" +age);

        System.out.println("Please enter price of product : ");
         double price= obj.nextDouble();

         System.out.println("Entered price is  :"+price);

    }
}
