import java.util.*;

public class Player {
	
	private ArrayList<Card> hand;
	private ArrayList<Card> deck;
	private int life;
	
	public Player(int life, ArrayList<Card> deck) {
		this.life = life;
		this.deck = deck;
		hand = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getHand() { return hand; }
	public ArrayList<Card> getDeck() {return deck;}
	public int getLife() {return life;}
	
}
