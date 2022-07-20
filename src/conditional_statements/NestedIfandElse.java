package conditional_statements;

public class NestedIfandElse {

    public static void main(String[] args) {

       int number=5;

       if (number !=0 ){

            if(number%2==0){

                System.out.println("Number is even Number : "+number);
            }else {

                System.out.println("Number is ODD Number : "+number);
            }

       }
       else {

           System.out.println("Entered number is invalid:"+number);
       }



    }
}
