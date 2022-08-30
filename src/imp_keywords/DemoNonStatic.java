package imp_keywords;

public class DemoNonStatic {

    public int myvar=30; // non static data

    public static void m1(){ // static method

        System.out.println("THis is Static method ......");

        //System.out.println(myvar); NON STATIC DATA CAN NOT BE USED IN STATIC METHOD BECAUSE
        // WE CAN CALL STATIC METHOD DIRECTLY WITHOUT CREATING OBJECT
    }

    public static void main(String[] args) {

        DemoNonStatic obj= new DemoNonStatic();
        System.out.println(obj.myvar);

        DemoNonStatic.m1();

    }
}
