public class Rate {
    public static void main(String[] args) {
        if (args.length == 2) {
            String gender = args[0];
            int age;

            try {
                age = Integer.parseInt(args[1]);

                if (gender.equalsIgnoreCase("Female")) {
                    if (age >= 1 && age <= 58) {
                        System.out.println("Interest Rate: 8.2%");
                    } else if (age >= 59 && age <= 100) {
                        System.out.println("Interest Rate: 9.2%");
                    } else {
                        System.out.println("Invalid age range.");
                    }
                } else if (gender.equalsIgnoreCase("Male")) {
                    if (age >= 1 && age <= 58) {
                        System.out.println("Interest Rate: 8.4%");
                    } else if (age >= 59 && age <= 100) {
                        System.out.println("Interest Rate: 10.5%");
                    } else {
                        System.out.println("Invalid age range.");
                    }
                } else {
                    System.out.println("Invalid gender. Use 'Male' or 'Female'.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer for age.");
            }
        } else {
            System.out.println("Please provide exactly two arguments: <Gender> <Age>");
        }
    }
}