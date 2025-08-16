package Arrays;
public class AsciiToChar {
    public static void main(String[] args) {
        int[] asciiValues = {65, 66, 67, 68, 69}; // ASCII for A, B, C, D, E

        for (int value : asciiValues) {
            System.out.print((char) value);
        }
    }
}