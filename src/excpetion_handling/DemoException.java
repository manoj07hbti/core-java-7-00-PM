package excpetion_handling;

public class DemoException {

    public int divide(int a, int b){
        System.out.println("Inside divide method ");

        int divide=0;
        try{
            divide=a/b;
        }
        catch (Exception e){
            System.out.println("Exception occurred "+e);
        }

        finally {
            System.out.println("*********************** This is finally block , it will always execute.....");
        }
        return divide;
    }

    public void array(){

        int arr[]={1,4,5,6,7};

        try {
            System.out.println("Printing array element "+arr[5]);
        }
       catch (Exception e){
            System.out.println("Invalid index found to access array "+e);
       }
    }


    public static void main(String[] args) {


        DemoException obj = new DemoException();

        System.out.println("Before calling Divide method.....");
        int divide = obj.divide(10,2);
        System.out.println("After calling Divide method.....");
        System.out.println("Division is "+divide);

        obj.array();
        System.out.println("After calling Array method.....");
    }
}
