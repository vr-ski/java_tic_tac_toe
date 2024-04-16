public class Game {
	
	private int size;
	private int[][] grid;
	
	public Game(int newSize) {
		size = newSize;
		grid = new int[size][size];
	}

	private boolean registerMove(int x, int y, Player player) {
		
		boolean successful_outcome = false;

		if grid[x][y] == "empty" {
			grid[x][y] = player.getSymbol()
			successful_outcome = true;
		}

		return successful_outcome;
	
	}

	private boolean confirmWin(Player player) {
		
		// check if player wins
		return
	}

	private boolean confirmEndOfGame() {
		
		// check end of game 
		return
	}

	public void playerTurn(int x, int y, Player player) {
		
		// call private methods
	
	}

}
