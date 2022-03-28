package com.bridgelabz;

public class DeckOfCards extends Players {
	
	private String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	int n = suits.length * ranks.length;
	
	public String[] deckInitialize() {
		String[] deck = new String[this.n];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
			}
		}
		// Shuffling
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		return deck;

	}
	
	public String[] shuffleCard(String[] deck) {
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		return deck;
	}
	
	public static void main(String[] args) {
	    
		DeckOfCards deckOfCards = new DeckOfCards();
		String[] deck = deckOfCards.deckInitialize();
		deckOfCards.addingPlayer();
		deckOfCards.playerSequence();
		
		String[] shuffledDeck = deckOfCards.shuffleCard(deck);
		

	}

}
