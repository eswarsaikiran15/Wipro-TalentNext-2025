public class ColorCode {
    public static void main(String[] args) {
        if (args.length == 1 && args[0].length() == 1) {
            char code = Character.toUpperCase(args[0].charAt(0));

            switch (code) {
                case 'R':
                    System.out.println("Red");
                    break;
                case 'B':
                    System.out.println("Blue");
                    break;
                case 'G':
                    System.out.println("Green");
                    break;
                case 'O':
                    System.out.println("Orange");
                    break;
                case 'Y':
                    System.out.println("Yellow");
                    break;
                case 'W':
                    System.out.println("White");
                    break;
                default:
                    System.out.println("Invalid Code");
            }
        } else {
            System.out.println("Please provide exactly one alphabet character as color code.");
        }
    }
} 
