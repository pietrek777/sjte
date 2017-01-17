package pl.mccode.sjte.card.meta;

public enum CardSuit {
	SPADES("spades", "♠", 40), CLUBS("clubs", "♣", 60), DIAMONDS("diamonds", "♦", 80), HEARTS("hearts", "♥", 100);

	String alphaName;
	String unicodeSymbol;
	int marriagePointsValue;

	public String getAlphaName() {
		return alphaName;
	}

	public String getUnicodeSymbol() {
		return unicodeSymbol;
	}

	public int getMarriagePointsValue() {
		return marriagePointsValue;
	}

	CardSuit(String alphaName, String unicodeSymbol, int marriagePointsValue){
		this.alphaName = alphaName;
		this.unicodeSymbol = unicodeSymbol;
		this.marriagePointsValue = marriagePointsValue;
	}
	@Override
	public String toString() {
		return "Card suit: " + alphaName;
	}
}
