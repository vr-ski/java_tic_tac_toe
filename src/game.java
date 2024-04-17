public class Game {
	
	private static final int EMPTY = 0;
	private int size;
	private int[][] grid;
	
	public Game(int newSize) {
		this.size = newSize;
		grid = new int[this.size][this.size];
	}

	private boolean registerMove(int x, int y, int player) {
		
		boolean successfulOutcome = false;

		if (grid[x][y] == EMPTY) {
			grid[x][y] = player.getSymbol()
			successfulOutcome = true;
		}

		return successfulOutcome;
	
	}

	private boolean confirmWin(int player) {
		
		// check if player wins
		playerWon = false;
		
		if (this.grid[0][0] == player) {
			if (this.grid[0][1] == player) {
				if (this.grid[0][2] == player) {
					playerWon = true;
				}
			}
		}

		return playerWon;
	}

	private boolean confirmEndOfGame() {
		
		// check end of game
		return
	}

	public void playerTurn(int x, int y, int player) {
		
		// call private methods
	
	}

}
