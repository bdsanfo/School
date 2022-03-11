import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;


public class CheckLocation{

	public int[][] numberGrid;
	public int return_x;
	public int return_y; 

	public void checkLocation(int i,int j){
		int value = numberGrid[i][j];
	}

	public void setNumberGrid(int x,int y){
		MineBoard board = new MineBoard(x,y);
		numberGrid = board.getNumberGrid();
		set_x(x);
		set_y(y);

	}
	public int[][] getNumberGrid(){
		return numberGrid;
	}
	public void set_x(int x){
		return_x=x;
	}
	public void set_y(int y){
		return_y=y;
	}
	public int get_x(){
		return return_x;
	}
	public int get_y(){
		return return_y;
	}
}	