package conditional_statements;

public class NestedIfString {

    public static void main(String[] args) {


        String country="INDIA";
        int population=100;

        if (country=="INDIA"){

            if(population>=100){

                System.out.println("High Population..");
            }
            else {
                System.out.println("Population under control ....");
            }
        }
        else {

            System.out.println("Invalid Country "+country);
        }
    }
}
