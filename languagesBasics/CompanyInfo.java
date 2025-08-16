package languagesBasics;

public class CompanyInfo {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments: <CompanyName> <CityName>");
            return;
        }

        String companyName = args[0];
        String cityName = args[1];

        System.out.println(companyName + " Technologies " + cityName);
    }
}
