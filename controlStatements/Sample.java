// Save this file as Sample.java
public class Sample {
    public static void main(String[] args) {
        // Initialize a character
        char ch = '#';  // You can change this to test other characters

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}