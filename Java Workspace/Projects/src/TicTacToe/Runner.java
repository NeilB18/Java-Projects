package TicTacToe;


public class Runner {
	public static void main(String[] args) {
		runGame();
		
	}
	
	public static void runGame() {
		boolean game = true;
		Board board = new Board();
		Player pOne = new Player("Player 1","X");
		Player pTwo = new Player("Player 2","O");
		board.showInstructions();
		while (game) {
			pOne.turn(board);
			if (Checker.check(board,pOne)) {
				System.out.printf("\n\n%s has won the game",pOne.getName());
				break;
			}
			
			pTwo.turn(board);
			if (Checker.check(board,pTwo)) {
				System.out.printf("\n\n%s has won the game",pTwo.getName());
				break;
			}

			
		}
		
	}
}