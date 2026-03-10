import java.util.function.Function;

public class SquareMethodRef {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = SquareMethodRef::square;
        System.out.println("Square: " + squareFunction.apply(5));
    }
}
