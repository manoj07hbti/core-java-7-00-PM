package methods;

public class Student {

    String name;
    int age;
    String section;

    // play , eat , read

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void playMethod(){

        System.out.println("This is play method of student ..");
    }

    public void eatMethod(){

        System.out.println("This is eat method of student......");
    }

    public void readmethod(){

        System.out.println("This is read method ......");
    }


    public static void main(String[] args) {

        Student obj= new Student();// STEP1
        obj.playMethod();// STEP 2
        obj.eatMethod();
        obj.readmethod();

    }


}
