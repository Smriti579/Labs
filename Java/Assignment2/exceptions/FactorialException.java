public class FactorialException {
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial: " + factorial(-5));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
