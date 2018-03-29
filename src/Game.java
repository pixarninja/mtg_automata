import java.util.ArrayList;
import java.util.Stack;

public class Game {

	private Player player;
	private Player opponent;
	private int turn;
	private String turnState;
	private Stack<Card> stack;
	private int winner = 0;
	
	public Game() {
		//TODO: initialize players with their proper decks and life counters
		player = new Player(20, new ArrayList<Card>());
		opponent = new Player(20, new ArrayList<Card>());
		stack = new Stack<>();
		turn = 0;
		turnState = null;
	}
	
	/* Advances the game by a turn */
	public void nextTurn() {
		turn++;
		if(turn % 2 == 0) {
			takeTurn(player, opponent);
		}
		else {
			takeTurn(opponent, player);
		}
		
		// test to see if there was a winner
		if(player.getLife() <= 0) {
			winner = 2;
		}
		else if(opponent.getLife() <= 0) {
			winner = 1;
		}
	}
	
	/* Knowing who is currently playing, create an environment where the
	 * active player can play cards and the opponent can counter them
	 * @param player, the active player
	 * @param opponent, the opponent to the active player
	 */
	public void takeTurn(Player player, Player opponent) {
		turnState = "UPKEEP";
		//TODO: play moves
		turnState = "PRECOMBAT";
		//TODO: play moves
		turnState = "COMBAT";
		//TODO: play moves
		turnState = "POSTCOMBAT";
		//TODO: play moves
		turnState = "END";
		//TODO: play moves
	}
	
	/* Returns true if the game is still going */
	public Boolean isActive() {
		if(winner == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/* Returns a string outcome of the game */
	public String getOutcome() {
		switch(winner) {
		case 1:
			return "Player";
		case 2:
			return "Opponent";
		default:
			return "Tie";
		}
	}
	
}
