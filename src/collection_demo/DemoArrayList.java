package collection_demo;

import java.util.ArrayList;

public class DemoArrayList {

    public void createArrayList(){
      //SYNTAX : ArrayList objName= new ArrayList();

        ArrayList list=new ArrayList();// create object of List

        // list.add(Object);
        list.add("Java");  // 0 index
        list.add("Spring Boot"); // 1 index
        list.add("Cloud");// 2 index
        list.add("Microservice..");// 3 index
        list.add(33);
        list.add(55.7);
        list.add('A');
        // read the data  get(index);

        System.out.println("Printing data of list at 1 index  " +list.get(1));
        System.out.println("Printing data of list at 2 index  " +list.get(2));
        System.out.println("Printing data of list at 3 index  " +list.get(3));

        // repeated work loop to print all data

        for(int i=0; i<list.size(); i++ ){

            System.out.println("Printing in Loop..." +" index "+i+ " data " +list.get(i));
        }

        // advanced for loop :  for (DataType var: collectionName){ CODE }

        for (Object var: list){

            System.out.println("Advanced for Loop ..."+var);
        }
    }


    public static void main(String[] args) {

        DemoArrayList obj=new DemoArrayList();
        obj.createArrayList();
    }



}
