import java.util.Scanner;

public class BinaryFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        String paddedBinary = String.format("%8s", binary).replace(' ', '0');

        System.out.println(paddedBinary);
        sc.close();
    }
}

