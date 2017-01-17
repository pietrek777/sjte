package pl.mccode.sjte.card.meta;

public enum CardDeck {
	NINE("nine", "9"), JACK("jack", "J"), QUEEN("queen", "Q"), KING("king", "K"), TEN("ten", "10"), ACE("ace", "A");

	String alphaName;
	String deckSymbol;

	public String getAlphaName() {
		return alphaName;
	}

	public String getDeckSymbol() {
		return deckSymbol;
	}

	CardDeck(String alphaName, String deckSymbol){
		this.alphaName = alphaName;
		this.deckSymbol = deckSymbol;
	}

	@Override
	public String toString() {
		return "Card deck: " + alphaName;
	}
}

