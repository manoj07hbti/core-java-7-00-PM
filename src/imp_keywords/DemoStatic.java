package imp_keywords;

public class DemoStatic {

    public static int myvar=33;


    public static void m1(){

        System.out.println("This is M1 method .....");
    }

    public static void main(String[] args) {

       /* DemoStatic obj= new DemoStatic();
        System.out.println("Printing myvar : "+obj.myvar);*/

      // we can call static variable without creating object
      // ClassName.varName

      System.out.println("Printing my var using static "+ DemoStatic.myvar);

      //METHOD
        /*DemoStatic obj= new DemoStatic();
        obj.m1();*/
      // ClassName.methodName();

      DemoStatic.m1();

    }
}
