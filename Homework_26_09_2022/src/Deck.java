public class Deck {
    final String[] suits = {"clubs", "diamonds", "hearts", "spades"};
    final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    final int numberOfCards = suits.length * rank.length; // number of cards

    // deck initialization
    public String[] deckInitialisation(int numberOfCards) {
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        return deck;
    }

    // deck shuffling
        for (int i = 0; i < numberOfCards; i++) {
        int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
        String temp = deck[card];
        deck[card] = deck[i];
        deck[i] = temp;
    }

    // the shuffled deck is displayed
        for (int i = 0; i < players * cardsForPlayer; i++) {
        System.out.println(deck[i]);

        if (i % cardsForPlayer == cardsForPlayer - 1)
            System.out.println();
    }
}
