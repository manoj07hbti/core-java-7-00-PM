package methods;

public class MethodWithOutPut {

    //SYNTAX : access_specifier Datatype(return_type)  method_name (parameter) {CODE..}


    public String message(String name) {

        String output = "Welcome to Java Programming ..." + name;

        return output;
    }

    public int makeSquare(int number) {

        int result = number * number;

        return result;
    }

    public double makeDoublePrice(double price) {
        double output = price * 2;

        return output;
    }

    public static void main(String[] args) {

        MethodWithOutPut obj = new MethodWithOutPut();
        String output = obj.message("Rahul"); // store the output

        System.out.println("output of welcome method is " + output);

        int result = obj.makeSquare(13);// store the output
        System.out.println("Result of makeSquare methos is : " + result);

        double price = obj.makeDoublePrice(35.7);// store output
        System.out.println("double price of product is " + price);

    }
}
