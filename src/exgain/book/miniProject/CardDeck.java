package exgain.book.miniProject;

class Card {
    private String name;
    private String number;

    public Card(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return name + number;
    }
}

class Deck {
    private Card[] cards;

    public Deck() {
        String[] names = { "클럽", "다이아몬드", "하트", "스페이드" };
        String[] numbers = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        cards = new Card[52];

        int index = 0;
        for (String name : names) {
            for (String number : numbers) {
                cards[index] = new Card(name, number);
                index++;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }
}

public class CardDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
    }
}
