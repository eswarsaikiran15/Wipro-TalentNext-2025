import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PalindromeWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("madam", "hello", "noon", "java", "civic", "world", "level", "code", "radar", "fun"));

        Predicate<String> isPalindrome = str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

        List<String> result = words.stream()
            .filter(isPalindrome)
            .collect(Collectors.toList());

        System.out.println("Palindromes: " + result);
    }
}
