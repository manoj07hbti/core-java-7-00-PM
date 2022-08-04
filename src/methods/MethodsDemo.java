package methods;

public class MethodsDemo {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void makeSquare(int number){


        System.out.println("Square of number is "+number*number);
    }

    public void checkEvenOdd(int number){

        if(number%2==0){
            System.out.println("Number is Even number "+number);
        }
        else {
            System.out.println("Number is ODD number "+number);
        }
    }

    public void dayOfWeek(){

        int day=6;

        switch (day){

            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;

            default:  System.out.println("Invalid day entred ....");


        }


    }

    public static void main(String[] args) {

        MethodsDemo obj= new MethodsDemo();
        obj.makeSquare(11);

        obj.checkEvenOdd(4);

        obj.dayOfWeek();
    }
}
