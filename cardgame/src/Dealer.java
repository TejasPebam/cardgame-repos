import java.util.*;

public class Dealer {
    private List<Card> deck;

    public Dealer() {
        deck = new ArrayList<>();
        for (String suit : Card.getSuits()) {
            for (String rank : Card.getRanks()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card pickCard() {
        if (deck.isEmpty()) return null;
        return deck.remove(new Random().nextInt(deck.size()));
    }

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.shuffleDeck();
        Card pickedCard = dealer.pickCard();
        System.out.println("Picked card: " + pickedCard);
    }
}