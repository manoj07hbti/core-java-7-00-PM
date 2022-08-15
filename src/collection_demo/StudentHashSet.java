package collection_demo;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public  HashSet<Student> createStudentSet(){

        //SYNTAX:    HashSet <DATATYPE> objName= new HashSet<>();

        HashSet<Student> studentHashSet= new HashSet<>();
        //create Object of Student

        Student student1= new Student("Raj",20,"CS");
        Student student2= new Student("Mukesh",23,"IT");
        Student student3= new Student("Rahul",20,"CS");
        Student student4= new Student("Raj",20,"CS");

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        return studentHashSet;
    }

    public static void main(String[] args) {

        StudentHashSet obj= new StudentHashSet();
        HashSet<Student> studentHashSet= obj.createStudentSet();

        for (Student var: studentHashSet){

           System.out.println("Printing Student Set : "+var.getName());
        }
    }
}
