import java.io.*;
import java.util.Scanner;

public class CharCountInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char ch = sc.nextLine().toLowerCase().charAt(0);

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (Character.toLowerCase((char) c) == ch) {
                    count++;
                }
            }

            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
