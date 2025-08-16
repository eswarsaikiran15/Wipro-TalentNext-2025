import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Card> symbolMap = new TreeMap<>();
        int count = 0;

        while (symbolMap.size() < 4) {
            System.out.print("Enter a card :");
            String input = sc.nextLine().trim();
            if (input.length() < 2) continue;

            String symbol = input.substring(0, 1);
            int number = Integer.parseInt(input.substring(1));
            count++;

            if (!symbolMap.containsKey(symbol)) {
                symbolMap.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are :");
        for (Card c : symbolMap.values()) {
            System.out.println(c);
        }
    }
}
