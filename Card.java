package arrayList;

/**
 * 
 * @author Brandon Nhem
 * @author Anthony Pham
 * Date - 9/10/18
 * This class is the Card class in which we can set the rank and suit of the card.
 * 
 * No Inputs required
 * Outputs: -getValue gives the value of a card or the value of a hand
 * 			-isFaceUp gives a boolean value if the card is faced up or down
 */

public class Card {

	private char suit;
	private int rank;
	private Boolean faceUp;
	
	public Card(char cardSuit, int cardRank)
	{
		suit = cardSuit;
		rank = cardRank;
		faceUp = true;
	}
	
	public void display()
	{
		/**
		 * Display: Displays the cards. If faced up, values appear.
		 * 			Otherwise, values appear as "?".
		 */
		
		
		if (faceUp == true) {
			if (rank < 11) {
				System.out.print(rank);
				System.out.print(" of ");
				System.out.println(suit);
			}
			else if (rank == 11) {
				System.out.print("Jack of ");
				System.out.println(suit);
			}
			else if (rank == 12) {
				System.out.print("Queen of ");
				System.out.println(suit);
			}
			else if (rank == 13) {
				System.out.print("King of ");
				System.out.println(suit);
			}
			else if (rank == 14) {
				System.out.print("Ace of ");
				System.out.println(suit);
			}
		}
		else {
			System.out.println("? of ?");
		}
	}
	public int getValue(int total) {
		/**
		 *  getValue: Get's the value of the card. Cards from 2 - 9 are their
		 *  		  real values. Cards 10, Jack, Queen, King are always 10.
		 *  		  Ace will be auto determined as either 11 or 1.
		 *  Args: int Total - Passes the total of the player's hand.
		 *  Returns: The value of the cards.
		 */
		
		int cardValue = 0;
		
		if (rank < 10) {
			cardValue = rank;		
		}
		else if (rank >= 10 & rank < 14) {
			cardValue = 10;
		}
		else if (rank == 14) {
			if (total + 11 > 21) {
				cardValue = 1;
			}else {
				cardValue = 11;
			}
		}
		return cardValue;
	}
	
	public void setFaceUp() {
		/**
		 * setFaceUp: Sets card to be faced up.
		 */
		
		faceUp = true;
	}
	
	public void setFaceDown() {
		/**
		 * setFaceDown: Sets card to be faced down.
		 */
		
		faceUp = false;
	}
	
	public boolean isFaceUp() {
		/**
		 * isFaceUp: Detects if the card is faced up.
		 * Return: Returns true if the card is faced up, false if faced down
		 */
		
		if (faceUp == true) {
			return true;
		} else {
			return false;
		}
	}
}
