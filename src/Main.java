
public class Main {
	
	public static void main(String[] args) {
		
		Game game = new Game();
		while(game.isActive()) {
			game.nextTurn();
		}
		
		System.out.println("Winner: " + game.getOutcome());

	}

}
