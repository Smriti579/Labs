import java.util.ArrayDeque;
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        str = str.replaceAll("\\s+", "").toLowerCase();
        for (char ch : str.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1)
            if (!deque.pollFirst().equals(deque.pollLast())) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); 
        System.out.println(isPalindrome("hello"));  
        System.out.println(isPalindrome("A man a plan a canal Panama")); 
    }
}
