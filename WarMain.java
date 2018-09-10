package arrayList;

/**
 * 
 * @author Brandon Nhem
 * @author Anthony Pham
 *
 */

public class WarMain {

	public static void main(String[] args) {
		int amountOfPlays = 26; // you can only play 26 times
		int P1 = 0; // total wins for Player One
		int P2 = 0; // total wins for Player Two
		Deck cardDeck = new Deck();
		Deck playerOne = new Deck(0); // empty hand
		Deck playerTwo = new Deck(0); // empty hand

		cardDeck.shuffleDeck();
		playerOne.setPlayer(cardDeck);
		playerTwo.setPlayer(cardDeck);
		
		int cont = 0; // used as a check to stop playing or not

		while (amountOfPlays != 0)
		{
			while (cont == 0)
			{
				if(playerOne.sizeOfDeck() == 0 || playerTwo.sizeOfDeck() == 0)
				{
					// no more cards
					cont = 1;
					break;
				}
				Card playerOneCard = playerOne.deal();
				System.out.print("Player One plays "); 
				playerOneCard.display();
				Card playerTwoCard = playerTwo.deal();
				System.out.print("Player Two plays ");
				playerTwoCard.display();
				if (playerOneCard.getValue(0) == playerTwoCard.getValue(0))
				{
					System.out.println("War triggered. No winner.");
				}
				else if (playerOneCard.getValue(0) > playerTwoCard.getValue(0))
				{
					System.out.println("Player One wins the round");
					P1++; // add to total win for player one
				}
				else
				{
					System.out.println("Player Two wins the round");
					P2++; // add to total win for player two
				}
			}
			amountOfPlays--;
		}
		
		System.out.println("Out of cards. Game Over.");

		if (P1 > P2)
		{
			System.out.println("Player One wins with " + P1 + " wins total!");
		}
		else
		{
			System.out.println("Player Two wins with " + P2 + " wins total!");

		}	
		
		System.out.println("\n\n------ War simulation ------");
		
		Deck warDeck = new Deck();
		Deck warP1 = new Deck(0);
		Deck warP2 = new Deck(0);
		
		warDeck.shuffleDeck();
		warP1.warSet1();
		warP2.warSet2();

		Card playerOneCard = warP1.deal();
		System.out.print("Player One plays "); 
		playerOneCard.display();
		Card playerTwoCard = warP2.deal();
		System.out.print("Player Two plays ");
		playerTwoCard.display();
		
		System.out.println("WAR!");
		
		Card warCardP11 = warP1.deal();
		Card warCardP12 = warP1.deal(); 
		Card warCardP13 = warP1.deal(); 
		Card warCardP14 = warP1.deal();
		
		Card warCardP21 = warP2.deal();
		Card warCardP22 = warP2.deal(); 
		Card warCardP23 = warP2.deal(); 
		Card warCardP24 = warP2.deal(); 
			
		System.out.print("War card for Player One is ");
		warCardP11.display();
		System.out.print("War card for Player One is ");
		warCardP12.display();
		System.out.print("War card for Player One is ");
		warCardP13.display();
		
		System.out.print("War card for Player Two is ");
		warCardP21.display();
		System.out.print("War card for Player Two is ");
		warCardP22.display();
		System.out.print("War card for Player Two is ");
		warCardP23.display();
		
		System.out.print("\nWar card for Player One is ");
		warCardP14.display();
		System.out.print("War card for Player Two is ");
		warCardP24.display();
		
		if (warCardP14.getValue(0) > warCardP24.getValue(0))
		{
			System.out.println("Player One Wins.");
		}
		else
		{
			System.out.println("Player Two Wins.");
		}
		System.out.println("Game Over.");
	}
}
