package excpetion_handling;

public class CustomeException {

    public void doVoting(int age) throws AgeNotElligibleException{

        if(age>18){

            System.out.println("Welcome to Voting App....");
        }
        else {

            throw new AgeNotElligibleException("Age is less than 18, so Not eligible for voting ");
        }

    }

    public static void main(String[] args) {

        CustomeException obj= new CustomeException();
        try {
            obj.doVoting(17);
        }
        catch (Exception e){

            System.out.println("Exception occurred ....."+e);
        }


    }
}
