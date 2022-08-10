package collection_demo;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {


    public  ArrayList<Student> createStudentArrayList(){

        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList <Student> studentArrayList= new ArrayList<>();

        // create student object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name of Student: ");
        String name= scanner.nextLine();
        System.out.println("Please enter Age of Student: ");
        int age=scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter Section of Student: ");
        String section=scanner1.nextLine();

        Student student1= new Student(name,age,section);
        Student student2= new Student("Mohit",22,"CS");
        Student student3= new Student("Mukesh",23,"CS");

        // add object to list

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        return studentArrayList;
    }

    public static void main(String[] args) {

        StudentArrayList obj= new StudentArrayList();
        ArrayList<Student> students= obj.createStudentArrayList();

        for (Student var: students){

            System.out.println("Printing Students .."+var.getName() +" Age:"+var.getAge() + " Section: "+var.getSection());
        }
    }

}
