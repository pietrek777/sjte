package pl.mccode.sjte.card;

import pl.mccode.sjte.card.meta.CardDeck;
import pl.mccode.sjte.card.meta.CardSuit;

import java.util.Objects;

public class Card {
	private CardDeck deck;
	private CardSuit suit;

	public CardDeck getDeck() {
		return deck;
	}

	public CardSuit getSuit() {
		return suit;
	}

	public Card(CardDeck deck, CardSuit suit) {
		this.deck = deck;
		this.suit = suit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Card)) return false;
		Card card = (Card) o;
		return getDeck() == card.getDeck() &&
				getSuit() == card.getSuit();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDeck(), getSuit());
	}

	@Override
	public String toString() {
		return "Card: { " + deck + ", " + suit + " }";
	}
	public String toUnicodeString(){
		return deck.getDeckSymbol() + " " + suit.getUnicodeSymbol() ;
	}
}
