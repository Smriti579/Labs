import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String str = sc.next();
        System.out.println("Is Palindrome: " + isPalindrome(str));
        sc.close();
    }
}
