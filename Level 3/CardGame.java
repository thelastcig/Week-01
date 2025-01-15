import java.util.Arrays;

public class CardGame {

   
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        
        String[] deck = new String[numOfCards];
        int index = 0;


        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;

        
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed to players.");
            return null;
        }

        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] players = new String[numOfPlayers][cardsPerPlayer];

        
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    
    public static void printPlayersAndCards(String[][] players) {
        if (players != null) {
            for (int i = 0; i < players.length; i++) {
                System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
            }
        }
    }

    public static void main(String[] args) {
        
        String[] deck = initializeDeck();

        
        shuffleDeck(deck);

        
        int numOfCards = deck.length; 
        int numOfPlayers = 4; 
        
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);

        printPlayersAndCards(players);
    }
}
