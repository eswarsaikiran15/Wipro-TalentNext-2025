package Collection.List;

import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();

        numberList.add(10);       // int
        numberList.add(15.5f);    // float
        numberList.add(20.7);     // double

        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
