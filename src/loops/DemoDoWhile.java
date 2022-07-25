package loops;

public class DemoDoWhile {

    public static void main(String[] args) {

        //TODO    do { CODE }
        //            while(condition);


        int i=0;

        do{
            System.out.println("DO WHILE LOOP >>>"+i);
            i++;
        }
        while (i<10);

        int j=10;
        do {
            System.out.println("Decrement do while.."+j);
            j--;
        }
        while (j>0);

    }
}
