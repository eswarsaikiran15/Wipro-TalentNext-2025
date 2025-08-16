interface WordCount {
    int count(String str);
}

public class MyClassWithLambda {
    public static void main(String[] args) {
        WordCount wc = str -> str.trim().split("\\s+").length;
        String input = "This is a lambda expression assignment";
        System.out.println("Word count: " + wc.count(input));
    }
}
