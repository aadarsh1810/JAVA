Write a menu-driven Java Program for the following:
There are 52 cards in a deck, each of which belongs to one of four suits and one of 13 ranks. Represent a deck of cards as an array of Objects (*you may use the Vector class)
 Use integers to encode the ranks and suits
 Have suitable default &amp; parameterized constructors
 all data members to have private access
 The class ‘Card’ to have the following methods:
 createDeck() , printCard(), printDeck (), sameCard(),
compareCard(), sortCard() , findCard() which searches through an array of Cards to see whether it contains a certain card
 dealCards() function : to print 5 random cards from the existing deck.


Card Class
public Card(): Constructor method for the Card class that initializes the rank and suit of a new card to 0.
public Card(int rank, int suit): Constructor method for the Card class that takes two arguments, the rank and suit of a new card, and initializes them accordingly.
public int getRank(): Method that returns the rank of a card.
public int getSuit(): Method that returns the suit of a card.
public void printCard(): Method that prints out the rank and suit of a card.
public static Vector<Card> createDeck(): Static method that creates a new deck of cards, which is represented as a Vector of Card objects. The deck contains 52 cards, one for each rank and suit combination.
public static void printDeck(Vector<Card> deck): Static method that prints out all the cards in a given deck.
public boolean sameCard(Card other): Method that takes another card as an argument and returns true if the two cards have the same rank and suit.
public int compareCard(Card other): Method that takes another card as an argument and returns -1 if the current card has a lower rank than the other card, 1 if it has a higher rank, and 0 if they have the same rank. If they have the same rank, the method compares the suits to determine the order.
public static void sortDeck(Vector<Card> deck): Static method that sorts the cards in a deck using the compareCard() method.
public static void findCard(Vector<Card> deck, Card card): Static method that searches a given deck for a given card and prints out the index where it was found, or "Card not found" if it was not found.
public static void dealCards(Vector<Card> deck, int numCards): Static method that deals a specified number of cards randomly from a given deck and prints them out.
CardDeckGame Class
public static void main(String[] args): The main method of the CardDeckGame class, which runs a menu-driven program that allows the user to perform various operations on a deck of cards.
public static Card readCard(Scanner input): Static method that takes a Scanner object as an argument and prompts the user to enter the rank and suit of a card, then returns a new Card object with those values.
