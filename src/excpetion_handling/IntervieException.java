package excpetion_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IntervieException {


    public void m1(){

        try{
            int a =5;
        }

        catch(IndexOutOfBoundsException e){ // CHILD
            //
        }
        catch (RuntimeException e){ // PARENT
            //
        }
        catch (Exception e){ // Parent of all Exceptions

        }
    }

    public static void main(String[] args) {



    }
}
