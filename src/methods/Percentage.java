package methods;

import java.util.Scanner;

public class Percentage {

    public double percentage(int number , int ratio){

        double percentage= (number*ratio)/100;

        return percentage;
    }


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter number for which you want to calculate %");

        int number=scanner.nextInt();

        System.out.println("Please enter ratio of percentage ...");
        int ratio= scanner.nextInt();

        Percentage obj=new Percentage();
       double percertage= obj.percentage(number,ratio);

       System.out.println("Percentage of "+number + " with ratio "+ratio +" is : "+percertage);

    }

}
