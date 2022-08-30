package imp_keywords;

public class DemoFinalVariable {

    private int a=5;


    public static void main(String[] args) {

        final int age=23;

        DemoFinalVariable obj= new DemoFinalVariable();
        System.out.println("Before Change value of OBJ :"+obj.a);
        obj.a=10;

        System.out.println("Changed value of OBJ :"+obj.a);

        System.out.println("Value before change : "+age);

       // age=25; NO ONE CAN CHANGE VALUE OF FINAL VARIABLES

        System.out.println("Value After change : "+age);


    }
}
