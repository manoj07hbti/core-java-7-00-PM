package loops;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 7;

        boolean flag=false;

        for (int i = 2; i < number; i++) {

            if(number%i==0){

                flag=true;
                break;
            }

        }

        if(flag){

            System.out.println("Not A prime number");

        }
        else {
            System.out.println("number is a Prime Number");
        }
    }

}
