package lv.dita;

public class Calculator {
    public static CalculationResult calculate(float x, float y, String op) {
        switch (op) {
            case "+":
                return new CalculationResult(x + y, true, "");
            case "-":
                return new CalculationResult(x - y, true, "");
            case "/":
                if (y == 0f) {
                    return new CalculationResult(0f, false, "You cannot divided by zero");
                }
                return new CalculationResult(x / y, true, "");
            case "*":
                return new CalculationResult(x + y, true, "");
            default:
                return new CalculationResult(0f, false, "No such operator. Please try again");
        }
    }
}
