package collection_demo;

import model.Student;

import java.util.HashMap;

public class StudentHashMap {

    public  HashMap<Integer, Student> createStudenthashMap(){

        //SYNTAX: HashMap <DataType_key , DataType_Value> ObjName= new HashMap<>();

        HashMap<Integer, Student> studentHashMap= new HashMap<>();

        // data of student
        Student student1= new Student("Raj",20,"CS");

        Student student2= new Student("Mukesh",23,"IT");

        Student student3= new Student("Rahul",20,"CS");

        Student student4= new Student("Rajesh",23,"CS");

        // add to map

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);
        studentHashMap.put(4,student4);

      return studentHashMap;

    }


    public static void main(String[] args) {

        StudentHashMap obj= new StudentHashMap();
        HashMap<Integer, Student> studentHashMap= obj.createStudenthashMap();

        for(Integer var: studentHashMap.keySet()){


            System.out.println("Printing Student hashMap ..."+studentHashMap.get(var).getName());
        }

    }

}
