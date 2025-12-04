package cards;

public class Hand {
    /*
     * This question involves the Hand class which models the set of cards in a player’s hand. You will
write the complete Hand class, which contains the constructor and four methods.
The Hand constructor takes one integer parameter. The parameter specifies the maximum
number of cards the Hand can store.
The add method has one Card parameter for the Card to add to the Hand.
The length method has no parameters and returns the number of cards currently stored in the
Hand.
The get method returns the card with the specified index. This method does not otherwise
modify the Hand.
- Inputs must be from zero to less than length.
The remove method removes the card with the specified index from the Hand and returns the
removed card.
     */
    //write code for me

    private Card[] cards;
    private int count;
    public Hand(int maxSize) {
        cards = new Card[maxSize];
        count = 0;
    }
    public void add(Card card) {
        if (count < cards.length) {
            cards[count] = card;
            count++;
        }
    }
    public int length() {
        return count;
    }
    public Card get(int index) {
        if (index >= 0 && index < count) {
            return cards[index];
        }
        return null; // or throw an exception
    }
    public Card remove(int index) {
        if (index >= 0 && index < count) {
            Card removedCard = cards[index];
            for (int i = index; i < count - 1; i++) {
                cards[i] = cards[i + 1];
}
