import java.util.ArrayList;

public class StringOperations {

    public static ArrayList<String> performOperations(String s1, String s2) {
        ArrayList<String> resultList = new ArrayList<>();

        // Operation 1: Replace each alternate character in s1 with s2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                op1.append(s2);
            } else {
                op1.append(s1.charAt(i));
            }
        }
        resultList.add(op1.toString());

        // Operation 2: Replace last occurrence of s2 with reverse(s2) if it appears more than once
        int firstIndex = s1.indexOf(s2);
        int lastIndex = s1.lastIndexOf(s2);
        if (firstIndex != -1 && firstIndex != lastIndex) {
            StringBuilder op2 = new StringBuilder(s1);
            op2.replace(lastIndex, lastIndex + s2.length(), new StringBuilder(s2).reverse().toString());
            resultList.add(op2.toString());
        } else {
            resultList.add(s1 + s2);
        }

        // Operation 3: Delete first occurrence of s2 if it appears more than once
        if (firstIndex != -1 && firstIndex != lastIndex) {
            StringBuilder op3 = new StringBuilder(s1);
            op3.delete(firstIndex, firstIndex + s2.length());
            resultList.add(op3.toString());
        } else {
            resultList.add(s1);
        }

        // Operation 4: Divide s2 into two halves and add to beginning and end of s1
        int half = s2.length() / 2;
        int firstHalfLen = (s2.length() % 2 == 0) ? half : half + 1;
        String firstHalf = s2.substring(0, firstHalfLen);
        String secondHalf = s2.substring(firstHalfLen);
        String op4 = firstHalf + s1 + secondHalf;
        resultList.add(op4);

        // Operation 5: Replace characters in s1 that also exist in s2 with '*'
        StringBuilder op5 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) != -1) {
                op5.append('*');
            } else {
                op5.append(s1.charAt(i));
            }
        }
        resultList.add(op5.toString());

        return resultList;
    }

    // Sample main method to test
    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";
        ArrayList<String> results = performOperations(s1, s2);
        System.out.println(results);
    }
}
