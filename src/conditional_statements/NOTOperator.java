package conditional_statements;

public class NOTOperator {

    public static void main(String[] args) {

        int age=21;

        if(!(age>18)){

            System.out.println("Eligible for Voting .....");
        }
        else {
            System.out.println("NOT Eligible for Voting .....");
        }

        String city="AGRA";

        if( !(age>18) && city=="AGRA"){

            System.out.println("Eligible for voting in AGRA...");
        }
        else {
            System.out.println(" NOT Eligible for voting in AGRA...");
        }

    }
}
