package conditional_statements;

public class DemoSwitch {

    public static void main(String[] args) {

        //TODO  switch (expression){
        //                     case value1:
       //                              break;
        //                     case value2:
        //                             break;
        //                     case value3:
        //                             break;
        //                     }
        int age =33;

        switch (age){

            case 10:
                System.out.println("Person is child ");
                break;
            case 18:
                System.out.println("Person is Young");
                break;
            case 45:
                System.out.println("Person is Men");
                break;
            case 60:
                System.out.println("Person is Old Age");
                break;
            default:
                System.out.println("Age category does not exist");

        }





    }


}
