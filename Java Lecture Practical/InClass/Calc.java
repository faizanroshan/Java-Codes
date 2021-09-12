public class Calc {

    public static void main(String[] args) {
        
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);

        System.out.println("a + b = " + (num1 + num2));
        System.out.println("a - b = " + (num1 - num2));
        System.out.println("a * b = " + (num1 * num2));
        System.out.println("a / b = " + (num1 / num2));
    }
}
