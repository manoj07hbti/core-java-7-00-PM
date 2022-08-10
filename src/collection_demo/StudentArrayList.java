package collection_demo;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {


    public  ArrayList<Student> createStudentArrayList(){

        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList <Student> studentArrayList= new ArrayList<>();

        // create student object
        Student student1= new Student("Raj",23,"IT");
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
