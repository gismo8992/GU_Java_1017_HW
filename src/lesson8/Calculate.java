package lesson8;

public class Calculate {
    public double result (String expression) {
        String[] line = expression.split("");
        double num1 = 0;
        double num2 = 0;
        double number = 0;
        switch (expression) {
            case "+":
                number = num1 + num2;
            case "-":
                number = num1 - num2;
            case "*":
                number = num1 * num2;
            case "/":
                number = num1 / num2;
            default:
                number = 0;
                break;
        }
        return number;
    }
}
