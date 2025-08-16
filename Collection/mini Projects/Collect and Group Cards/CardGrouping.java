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

public class CardGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Card>> cardMap = new TreeMap<>();

        System.out.print("Enter Number of Cards :");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter card " + i + ":");
            String input = sc.nextLine().trim();
            if (input.length() < 2) {
                i--; // skip invalid input
                continue;
            }

            String symbol = input.substring(0, 1);
            int number = Integer.parseInt(input.substring(1));

            Card card = new Card(symbol, number);
            cardMap.putIfAbsent(symbol, new ArrayList<>());
            cardMap.get(symbol).add(card);
        }

        System.out.print("Distinct Symbols are :");
        for (String symbol : cardMap.keySet()) {
            System.out.print(symbol + " ");
        }
        System.out.println();

        for (String symbol : cardMap.keySet()) {
            List<Card> cards = cardMap.get(symbol);
            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;
            for (Card card : cards) {
                System.out.println(card);
                sum += card.getNumber();
            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }
    }
}
