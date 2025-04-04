public class Card {
    private String suit;
    private String rank;

    // Static constants for all possible suits and ranks
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
            "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King"
    };

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static String[] getSuits() {
        return SUITS;
    }

    public static String[] getRanks() {
        return RANKS;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}