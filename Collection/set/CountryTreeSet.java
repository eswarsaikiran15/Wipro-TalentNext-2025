package Collection.set;

import java.util.TreeSet;

public class CountryTreeSet {
    private TreeSet<String> countrySet = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        countrySet.add(countryName);
        return countrySet;
    }

    public String getCountry(String countryName) {
        for (String country : countrySet) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CountryTreeSet cts = new CountryTreeSet();
        cts.saveCountryNames("India");
        cts.saveCountryNames("USA");
        cts.saveCountryNames("Japan");

        System.out.println("TreeSet of countries: " + cts.countrySet);

        String search = "Japan";
        String result = cts.getCountry(search);
        if (result != null)
            System.out.println(search + " found in TreeSet.");
        else
            System.out.println(search + " not found in TreeSet.");
    }
}
