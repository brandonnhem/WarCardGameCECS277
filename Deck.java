package arrayList;

/**
 * 
 * @author Brandon Nhem
 * @author Anthony Pham
 *
 */

import java.util.ArrayList;

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
	
	public void display()
	{
		/**
		 * Display: Displays the entire deck
		 */
		
		for (int i = deck.size()-1; i >= 0; i--) {
			deck.get(i).Display();
		}
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
}
