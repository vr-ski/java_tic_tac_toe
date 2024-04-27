public class Game {
	
	private static final int EMPTY = 0;
	private byte size;
	private byte[][] grid;
	
	public Game(int newSize) {
		this.size = newSize;
		grid = new byte[this.size][this.size];
	}

	private boolean registerMove(byte x, byte y, byte player) {
		
		boolean successfulOutcome = false;

		if (grid[x][y] == EMPTY) {
			grid[x][y] = player.getSymbol()
			successfulOutcome = true;
		}

		return successfulOutcome;
	
	}

	private boolean confirmWin(byte player) {
		
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

	public void playerTurn(byte x, byte y, byte player) {
		
		// call private methods
	
	}

}
