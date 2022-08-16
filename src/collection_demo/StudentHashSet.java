package collection_demo;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public  HashSet<Student> createStudentSet(){

        //SYNTAX:    HashSet <DATATYPE> objName= new HashSet<>();

        HashSet<Student> studentHashSet= new HashSet<>();
        //create Object of Student

        Student student1= new Student("Raj",20,"CS");
        System.out.println("Hashcode of S1:"+student1.hashCode());

        Student student2= new Student("Mukesh",23,"IT");
        System.out.println("Hashcode of S2:"+student2.hashCode());

        Student student3= new Student("Rahul",20,"CS");
        System.out.println("Hashcode of S3:"+student3.hashCode());

        Student student4= new Student("Raj",20,"CS");
        System.out.println("Hashcode of S4:"+student4.hashCode());

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
