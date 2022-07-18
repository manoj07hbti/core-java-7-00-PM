package conditional_statements;

public class DemoMultipleIf {

    public static void main(String[] args) {

        //TODO if (condition1 operator condition2 operator condition3......)

        int age=20;
        String city="AGRA";
// TRUE && TRUE= TRUE (1X1=1)

        if(age>18 && city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA ");
        }
        else{
            System.out.println("Person is NOT eligible for voting in AGRA ");
        }
//TRUE && FALSE=FALSE(1X0=0)

        city="DELHI";
        if(age>18 && city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA ");
        }
        else{
            System.out.println("Person is NOT eligible for voting in AGRA :TRUE && FALSE=FALSE(1X0=0) ");
        }
// FALSE && TRUE =FALSE(0X1=0)

        age=10;
        city="AGRA";
        if(age>18 && city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA ");
        }
        else{
            System.out.println("Person is NOT eligible for voting in AGRA : FALSE && TRUE =FALSE(0X1=0) ");
        }

// FALSE && FALSE= FALSE(0X0=0)
       city="PUNE";

        if(age>18 && city=="AGRA"){

            System.out.println("Person is eligible for voting in AGRA ");
        }
        else{
            System.out.println("Person is NOT eligible for voting in AGRA : FALSE && FALSE= FALSE(0X0=0) ");
        }


    }
}
