package collection_demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemohashMap {

    public void createHashMap(){

        //SYNTAX: HashMap <DataType_key , DataType_Value> ObjName= new HashMap<>();

        HashMap <Integer, String> hashMap= new HashMap<>();

        //adding value to Map : put(key,value);

        hashMap.put(1,"Java");
        hashMap.put(2,"Java8");
        hashMap.put(3,"Spring");
        hashMap.put(4,"Spring Boot");

        // reading value from map:  get(key);

        System.out.println("Printing Map element at 3 index "+ hashMap.get(3));
        System.out.println("Printing Map element at 2 index  "+ hashMap.get(2));
        hashMap.put(2,"J2EE");
        System.out.println("after adding Duplicate key :Printing Map element at 2 index  "+ hashMap.get(2));
        // we can not have duplicate keys, if we add any duplicate key then it will override previous value

     // printing entire HashMap ..  keySet(); : it returns HashSet of Keys
        Set<Integer> keys= hashMap.keySet();// get all the key


        for (Integer var : keys){


            System.out.println("Printing Map in Loop .."+hashMap.get(var));
        }


    }

    public static void main(String[] args) {

        DemohashMap obj = new DemohashMap();
        obj.createHashMap();
    }
}
