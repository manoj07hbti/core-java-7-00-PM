package methods;

public class MethodWithInput {

    //Syntax : access_specifier return_type  method_name (Datatype varname) {CODE..}


    public void checkAge(int age){

        if(age<18){
            System.out.println("Person is Child");
        }
        else if(age>18 && age <45){

            System.out.println("Person is young....");
        }
        else {

            System.out.println("Person is old");
        }

    }

    public void hello(String name){

        System.out.println("Welcome to Java ..."+name);
    }


    public void message(String name, int age){

        System.out.println("Name is "+ name +" Age is "+age);
    }

    public static void main(String[] args) {

        MethodWithInput obj= new MethodWithInput();
        obj.checkAge(70);// obj.methodName(parameter_value);

        obj.hello("Mohit");

        obj.message("Raj",22);

    }
}
