public class CalculatorTest {

    public static void main(String[] args) {

        String expression = "5+3*5";
        float expected = 20f;

        float result = Float.parseFloat(Calculator.Run(expression));

        if (result == expected) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
