package Arrays;
public class MinMaxTwo {
    public static void main(String[] args) {
        int[] arr = {25, 42, 7, 99, 64, 12, 18};

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin) {
                secondMin = num;
            }

            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        System.out.println("Smallest numbers: " + firstMin + ", " + secondMin);
        System.out.println("Largest numbers: " + firstMax + ", " + secondMax);
    }
}