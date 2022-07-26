package loops;

public class DemoBreakContinue {

    public static void main(String[] args) {

        for(int i=0; i<10;i++){


            System.out.println("For Loop ...."+i);
            if(i==3){
                break;
            }
        }


        for (int i=0; i<5; i++){

            if(i==2){
             continue;
            }
            System.out.println("CONTINUE KEYWORD TESTING ....."+i);
        }

    }


}
