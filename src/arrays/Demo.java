package arrays;

public class Demo {

    public static void main(String[] args) {

        //TODO    Datatype varName []= {value1,value2,value3....valueN};

        String cities []={"AGRA","DELHI","JAIPUR","PUNE","KANPUR","KERALA","GOA"};

        //TODO  varName[INDEX]
        System.out.println("Printing index 2 of Array " +cities[2]);
        System.out.println("Printing index 4 of Array " +cities[4]);
        System.out.println("Printing index 0 of Array " +cities[0]);

        // printing all data of array

        for (int i=0; i<cities.length; i++){

            System.out.println("Printing city in loop: "+cities[i] );
        }

        // while loop
        int i=0;
        while(i<cities.length){

            System.out.println("Printing data in while Loop "+cities[i]);
            i++;
        }

        // ADVANCED FOR LOOP
        //TODO   for (DATATYPE varName : ArrayName){ CODE }

        for (String var:cities ){

            System.out.println("ADVANCED FOR LOOP..."+var);
        }


       int marks[]= {33,44,55,23,57,75,35,45,45,87,89,99};

        System.out.println("Printing index 1 of MARKS Array " +marks[1]);

        for(int var : marks){

            System.out.println("Printing marks Array : "+ var);
        }
    }
}
