package pl.mccode.sjte.util;

import pl.mccode.sjte.card.Card;
import pl.mccode.sjte.card.meta.CardDeck;
import pl.mccode.sjte.card.meta.CardSuit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardUtils {
	public static List<Card> getShuffledCards(){
		List<Card> list = new ArrayList<>();
		for(CardSuit cardSuit: CardSuit.values()){
			for(CardDeck cardDeck: CardDeck.values()){
				list.add(new Card(cardDeck, cardSuit));
			}
		}
		Collections.shuffle(list);
		return list;
	}
}
