package collection_demo;

import java.util.HashSet;

public class DemoHashSet {

    public HashSet<String> createStringHashSet(){

      //SYNTAX:    HashSet <DATATYPE> objName= new HashSet<>();

        HashSet <String> course= new HashSet<>();
        course.add("Java");
        course.add("Spring");
        course.add("Spring");
        course.add("Spring boot");
        course.add("Spring boot");
        course.add("Java");

        return course;
    }

    public  HashSet<Integer> createIntSet(){

        HashSet<Integer> marks= new HashSet<>();
        marks.add(75);
        marks.add(99);
        marks.add(45);
        marks.add(33);
        marks.add(75);
        marks.add(99);
        marks.add(45);
        marks.add(33);

        return marks;
    }

    public static void main(String[] args) {

        DemoHashSet obj = new DemoHashSet();
        HashSet<String> course= obj.createStringHashSet();

        for (String var: course){

            System.out.println("Printing String set :"+var);
        }


        HashSet<Integer> marks= obj.createIntSet();

        for(Integer var: marks){

            System.out.println("Printing Integer Set : "+var);
        }
    }
}
