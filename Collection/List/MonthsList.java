package Collection.List;

import java.util.*;

public class MonthsList {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>(Arrays.asList(
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        ));

        System.out.println("Months of the Year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}
