package arrayList;

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
	
	public void Display()
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
	
}