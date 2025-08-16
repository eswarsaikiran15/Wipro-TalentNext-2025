package Collection.set;

import java.util.HashSet;

public class CountrySet {
    private HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CountrySet cs = new CountrySet();

        cs.saveCountryNames("India");
        cs.saveCountryNames("USA");
        cs.saveCountryNames("Germany");

        System.out.println("All countries: " + cs.H1);

        String search = "USA";
        String result = cs.getCountry(search);
        if (result != null)
            System.out.println(search + " found in set.");
        else
            System.out.println(search + " not found in set.");
    }
}
