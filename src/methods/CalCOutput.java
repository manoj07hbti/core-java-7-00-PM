package methods;

public class CalCOutput {

    public int add(int a, int b) {

        int result = a + b;

        return result;
    }

    // sub
    // multi
    // divide

    public static void main(String[] args) {
        CalCOutput obj = new CalCOutput();

        int add = obj.add(34, 7);
        System.out.println("Addition is " + add);
    }
}
