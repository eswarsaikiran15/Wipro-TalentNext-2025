package languagesBasics;

public class Sample {
    public static void main(String[] args) {
       
        if (args.length != 1) {
            System.out.println("Please provide exactly one argument.");
            return;
        }

        String name = args[0];
        System.out.println("Welcome " + name);
    }
}
