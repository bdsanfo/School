import java.util.*;

public class Minesweeper{
	public static final int GAMEHEIGHT = 16;
	public static final int GAMEWIDTH = 13;
	public static boolean continueGame = true;

	public static void main(String[] args){
		RunGame game = new RunGame();
		//Scanner scanner = new Scanner(System.in);
	
		new MineFrame(GAMEHEIGHT,GAMEWIDTH);
		//game.runGame(GAMEWIDTH,GAMEHEIGHT);

		//while(continueGame = true){
 		//	int x = scanner.nextInt();
 		//	int y = scanner.nextInt();
 		//	game.continuePlaying(x,y);
 		//}
 	//board.checkLocation(x,y);
 	
 	//System.out.println(Arrays.deepToString(board.getDisplayMineGrid()));
 	//System.out.println(Arrays.deepToString(board.getNumberGrid()));
  	}
}

//Arrays.deepToString() prints arrays