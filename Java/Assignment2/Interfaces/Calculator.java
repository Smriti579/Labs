@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.compute(5, 3));
        System.out.println("Subtraction: " + subtract.compute(5, 3));
        System.out.println("Multiplication: " + multiply.compute(5, 3));
    }
}
