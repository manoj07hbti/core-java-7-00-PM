package imp_keywords;

public class DemoFinalVariable {

    public static void main(String[] args) {

        final int age=23;

        System.out.println("Value before change : "+age);

       // age=25; NO ONE CAN CHANGE VALUE OF FINAL VARIABLES

        System.out.println("Value After change : "+age);


    }
}
