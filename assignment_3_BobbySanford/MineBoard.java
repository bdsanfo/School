import javax.swing.*;
import java.util.*;

public class MineBoard{
	private int location;
	private int[][] grid;
	private int[][] numberGrid;
	private int[][] displayGrid;
	private int numberOfMines;
	private int surroundingMines;
	private int rowLength;
	private int columnLength;
	private int minesInGrid;//test
	private int minesInNumberGrid;

	public MineBoard(int row,int column){
		grid = new int[row+1][column+1];
		numberGrid = new int[row][column];
		displayGrid = new int[row][column];
		//setDisplayMineGrid();
		
		for (row=0; row<grid.length-1; row++){
			for(column=0; column<grid[row].length-1; column++){
				grid[row][column] = (int)(Math.random()*10);
				//System.out.println("grid1: "+Arrays.deepToString(grid));
				if (grid[row][column] <= 5){
					grid[row][column] = 0;
				}

				else{
					grid[row][column] = 1;
					minesInGrid +=1;
				}
				//System.out.println("grid2: "+Arrays.deepToString(grid));
			}
		}
		for(int i = 0; i<=row; i++){
			grid[i][column]=-1;
		}
		for(int i = 0; i<=column; i++){
			grid[row][i]=-1;
		}
		mineCount();
	}
	
	public int getNumberOfMines(){
		return minesInGrid;
				
	}
	
	public int[][] getMineGrid(){
		return grid;
	}

	public void mineCount(){
		CheckSurroundingMines check = new CheckSurroundingMines();
		check.setTempGrid(grid);

		for(int row=0; row<grid.length-1; row++){
			rowLength = grid.length;
			for(int column=0; column<grid[row].length-1; column++){
				columnLength = grid[row].length;
				
				if(grid[row][column] == 0){
					numberGrid[row][column] = check.recreateMineField(row,column,rowLength,columnLength);
				}
				else if(grid[row][column]!=0) {
					numberGrid[row][column] = 9;
					minesInNumberGrid+=1;
				}
			}
		}
	}

	public int getRowLength(){
		//mineCount();
		return rowLength-1;
	}
	public int getColumnLength(){
		//mineCount();
		return columnLength-1;
	}

	public int checkLocation(int x, int y){
		mineCount();
		location = numberGrid[x][y];
		setLocation(x,y);
		//displayGrid[x][y] = location;
		return location;
	}

	public int[][] getDisplayMineGrid(){
		return displayGrid;
	}

	public void setLocation(int x, int y){
		location = numberGrid[x][y];
	}	

	public int[][] getNumberGrid(){
		return numberGrid;
	}

	public void setFlag(int x,int y){
		displayGrid[x][y]=Integer.parseInt("F");
	}
}