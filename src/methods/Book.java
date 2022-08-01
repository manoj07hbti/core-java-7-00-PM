package methods;

public class Book {
    // properties or data members
    String name;
    int pages;
    String writerName;

    // capabilities or method or function
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    // read  , write

    public void readMethod(){

        System.out.println("This is read method ....");
    }

    public void wrtieMethod(){

        System.out.println("This is writeMethod....");
    }

    /* todo    Member function or method -- capabilities
        Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

    public static void main(String[] args) {

        Book obj= new Book();// Object created ..
       // TO EXECUTE METHOD  obj.MethodName();

        obj.readMethod();
        obj.wrtieMethod();
    }


}
