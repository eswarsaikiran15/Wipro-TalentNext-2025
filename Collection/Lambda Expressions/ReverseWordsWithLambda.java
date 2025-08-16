import java.util.*;

public class ReverseWordsWithLambda {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "honeydew", "kiwi", "lemon"));

        al.forEach(word -> System.out.println(new StringBuilder(word).reverse().toString()));
    }
}
