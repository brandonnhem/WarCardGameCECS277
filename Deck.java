package arrayList;

/**
 * 
 * @author Brandon Nhem
 * @author Anthony Pham
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	private ArrayList<Card> deck;
	
	public Deck() 
	{
		char [] suitArray = {'S', 'D', 'C', 'H'};
		int [] rankArray = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		deck = new ArrayList<Card>();
		for (int s = 0; s < 4; s++) { // creates deck with loop
			for (int r = 0; r < 13; r++) {
				Card tempCard = new Card(suitArray[s], rankArray[r]);
				deck.add(tempCard);
			}
		}
	}
	
	public Deck(int x)
	{
		/**
		 * Deck: Creates a deck, however different from Deck() because it is empty
		 * Args: int x - Simply a placeholder that does nothing but differentiating it from
		 * 				 the regular Deck() method that fills the entire ArrayList.
		 * 
		 */
		deck = new ArrayList<Card>();
	}
	
	
	public void setPlayer(Deck cardDeck)
	{
		/**
		 * setPlayer: Sets the player's deck by filling it with 26 cards.
		 */
		int i = 0;
		while (i < 26)
		{
			deck.add(cardDeck.deal());
			i++;
		}
	}
	
	public void display()
	{
		/**
		 * Display: Displays the entire deck
		 */
		
		for (int i = deck.size()-1; i >= 0; i--) {
			deck.get(i).display();
		}
	}
	
	public void warSet1()
	{
		/**
		 * warSet1: Meant for player one, sets a hard coded example for war, player one will always lose.
		 * 			Cards are added faced down to offer what is at stake.
		 */
		Card sameCard = new Card('S', 6);
		Card randCard1 = new Card('S', 3);
		Card randCard2 = new Card('S', 4);
		Card randCard3 = new Card('S', 5);
		Card randCard4 = new Card('S', 2);
		
		randCard1.setFaceDown();
		randCard2.setFaceDown();
		randCard3.setFaceDown();

		deck.add(sameCard);
		deck.add(randCard1);
		deck.add(randCard2);
		deck.add(randCard3);
		deck.add(randCard4);

	}
	
	public void warSet2()
	{
		/**
		 * warSet2: Meant for player two, sets a hard coded example for war, player two will always win.
		 *			Cards are added faced down to offer what is at stake.
		 */
		Card sameCard = new Card('A', 8);
		Card randCard1 = new Card('A', 3);
		Card randCard2 = new Card('A', 4);
		Card randCard3 = new Card('A', 5);
		Card randCard4 = new Card('A', 2);
		
		randCard1.setFaceDown();
		randCard2.setFaceDown();
		randCard3.setFaceDown();

		deck.add(sameCard);
		deck.add(randCard1);
		deck.add(randCard2);
		deck.add(randCard3);
		deck.add(randCard4);

	}

	public int sizeOfDeck()
	{
		/**
		 * sizeOfDeck: Gives the size of a deck
		 * Returns:    Size of Deck
		 */
		int size = deck.size();
		return size;
	}
		
	public Card deal()
	{
		/**
		 * Deal: Deals one card
		 * Return: Returns one card.
		 */
	
		Card card = deck.get(deck.size() - 1);
		deck.remove(deck.size() - 1);
		return card;
	}
	
	public void shuffleDeck() 
	{
		/**
		 * Shuffle: Takes random card in deck, removes it, adds it to the end
		 */
		
		Random rand = new Random();
		for (int i = 0; i < 1000; i++) {
			int x = rand.nextInt(deck.size());
			Card tempCard = deck.get(x);
			deck.remove(x);
			deck.add(tempCard);
		}
		
	}
}
