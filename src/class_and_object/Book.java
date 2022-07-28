package class_and_object;

public class Book {

    // properties
    String name="Java";
    int pageno=500;
    double price =454.34;

    public static void main(String[] args) {
        //TODO   ClassName ObjName= new ClassName();     OBJECT CREATION
        Book obj1= new Book();
        System.out.println("Book name : "+obj1.name);
        System.out.println("Book Pages : "+obj1.pageno);
        System.out.println("Book Price : "+obj1.price);

        Book obj2= new Book();

        //TODO obj.propertyname;
        System.out.println("OBJ 2 Book name : "+obj2.name);
        System.out.println("Book Pages : "+obj2.pageno);
        System.out.println("Book Price : "+obj2.price);

    }

}
