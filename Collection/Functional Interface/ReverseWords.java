import java.util.*;
import java.util.function.Consumer;

public class ReverseWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "world", "java", "lambda", "stream", "reverse", "function", "example", "program", "code"));

        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            }
        };

        reverseWords.accept(words);
        System.out.println("Reversed words: " + words);
    }
}
