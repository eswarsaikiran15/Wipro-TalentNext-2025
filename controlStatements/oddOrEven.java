

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
              System.out.print("Enter an Digit: ");
            int digit=obj.nextInt();
            if (digit%2==0){
                System.out.println(digit+" The Digit is Even");
            }
            else{
                System.out.println(digit+"The digit is Odd");
            }
        }
    }
}
