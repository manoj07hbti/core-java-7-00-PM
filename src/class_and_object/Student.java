package class_and_object;

public class Student {

    //Data member or properties

    String name;
    int age;
    String section;

    // parameterized constructor


    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public static void main(String[] args) {

        Student obj= new Student("Raj",23,"CS");

        System.out.println("Student name is "+obj.name +" Age: "+obj.age +" Section: "+obj.section);

        // change the name from Raj to Raj Kumar
         obj.setName("RAJ KUMAR");
        //Reading name
         System.out.println("updated name is "+obj.getName());

        Student obj2= new Student("Rahul",24,"IT");
        System.out.println("Student name is "+obj2.name +" Age: "+obj2.age +" Section: "+obj2.section);
        // change the section
        obj2.setSection("Information Technology");
        // read the section
        System.out.println("Updated Section is "+obj2.getSection());

        Student obj3= new Student("Mukesh",20,"CS");
        System.out.println("Student name is "+obj3.name +" Age: "+obj3.age +" Section: "+obj3.section);
        // change the age

        obj3.setAge(25);
        //read age
        System.out.println("Updated Age is :"+obj3.getAge());
    }
}
