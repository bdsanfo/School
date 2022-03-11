import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RunGame extends JPanel{
	MineBoard board;
	public int locationsRemaining;
	private int numberOfMines;


	public void runGame(int x,int y){
		board = new MineBoard(x,y);
		locationsRemaining = x*y;
		
		//System.out.println(Arrays.deepToString(board.getDisplayMineGrid()));
		//System.out.println(Arrays.deepToString(board.getNumberGrid()));	
	}
	
	public void continuePlaying(int x,int y){
		
		board.getNumberGrid();
		//locationsRemaining-=1;
		numberOfMines = board.getNumberOfMines();
		board.checkLocation(x,y);
		//System.out.println("locationsRemaining "+ locationsRemaining);
		//System.out.println(Arrays.deepToString(board.getMineGrid()));		
		//System.out.println(Arrays.deepToString(board.getDisplayMineGrid()));
		//System.out.println(Arrays.deepToString(board.getNumberGrid()));

		//System.out.println("num in grid: "+ board.getNumberOfMines());
		if(board.checkLocation(x,y) == 9){
			System.out.println("Boom!");
			//System.exit(0);
		} 
		else if(numberOfMines==locationsRemaining){
			System.out.println("Game Won!");
			//System.exit(0);
		}
	}
	public void continueFlag(int x, int y){
		
		board.getNumberGrid();
		board.setFlag(x,y);

	}
}
