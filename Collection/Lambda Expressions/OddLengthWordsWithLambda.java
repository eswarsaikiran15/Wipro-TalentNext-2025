import java.util.*;

public class OddLengthWordsWithLambda {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(
                "mango", "tree", "cloud", "rain", "sunshine",
                "pencil", "cup", "mouse", "keyboard", "window"));

        al.stream().filter(word -> word.length() % 2 != 0).forEach(System.out::println);
    }
}
