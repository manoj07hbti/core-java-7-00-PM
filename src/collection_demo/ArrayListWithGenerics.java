package collection_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWithGenerics {

    // create a method which will create a String ArrayList

    public ArrayList<String> createStringList(){

        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList <String> stringArrayList= new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Spring");
        stringArrayList.add("Cloud");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter string value for string Array list:");
        String input =scanner.nextLine();

        stringArrayList.add(input);
        //stringArrayList.add(11);  it is not allowing to store any other data
        //stringArrayList.add(5.8);
        return stringArrayList;
    }

    // create a method which will create a Integer ArrayList

    public ArrayList<Integer> createIntArraylist(){
        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList <Integer> marks= new ArrayList<>();
        marks.add(75);
        marks.add(45);
        //marks.add("Java"); can not store any other value apart from integer
        marks.add(33);

        return marks;
    }

    // create a method which will create a Double ArrayList

     public  ArrayList<Double> createDecimalList(){

        ArrayList<Double> price= new ArrayList<>();

        price.add(343.6);
        price.add(232.32);
        price.add(44.33);
        //price.add(1);

         return price;
     }


    public static void main(String[] args) {
        ArrayListWithGenerics obj= new ArrayListWithGenerics();
        ArrayList<String> output = obj.createStringList(); // store the output

        for(int i=0; i<output.size(); i++){

            System.out.println("Printing list "+output.get(i));
        }

        ArrayList <Integer> marks= obj.createIntArraylist();
        // SYNTAX : for (Datatype var: collectionName){CODE}
        for(Integer var : marks){

            System.out.println("Advanced for Loop.."+var);
        }

        ArrayList<Double> price=obj.createDecimalList();

        for (Double var: price){

            System.out.println("Printing price using advanced loop .."+var);
        }



    }

}
