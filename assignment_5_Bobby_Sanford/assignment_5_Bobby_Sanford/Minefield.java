import java.util.*;
import javax.swing.*;

public class Minefield{//model
	SetMinefield configure;
	private int difficulty = 10;
	int[][] minefield = new int[10][10];
	int[][] flaglocations = new int[10][10];
	private boolean gameWon = false;
	private boolean gameLost = false;
	private int turn = 0;	
	private int bombs;

	public Minefield(){
		configure = new SetMinefield();
		difficulty = getDifficulty();
		int i,j;
		Random random = new Random();
		for(i=0; i<10;i++){
			for(j=0;j<10;j++){
				if(random.nextInt((difficulty-1)+1)+1==difficulty){
					minefield[i][j] = 1;
					bombs+=1;
				}else{
					minefield[i][j]=0;
				}
				flaglocations[i][j]=0;
				//System.out.print(minefield[i][j]+",");
			}
			//System.out.println();
		}
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				if(minefield[i][j]==1){
					minefield[i][j]=10;
				}
			}
		}
		configure.setBoard(minefield);
		minefield = configure.getBoard();
		
		for(i=0;i<10;i++){//prints array TESTING
			for(j=0;j<10;j++){
				System.out.print(minefield[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("Bombs: "+ bombs);
	}

	public int getLocation(int i, int j){
		int location=10;
		if(!gameWon && !gameLost){
			location = minefield[i][j];
			setTurn();
		}
		return location;
	}

	public void setTurn(){
		turn+=1;
		int locationsRemaining = 100-turn;
		if(locationsRemaining==bombs){
			gameWon = true;
		}
	}

	public void gameLost(){
		gameLost = true;
	}

	public boolean checkLost(){
		if(gameLost){
			return true;
		}else{
			return false;
		}
	}

	public boolean checkWon(){
		if(gameWon){
			return true;
		}else{
			return false;
		}
	}

	public void setDifficulty(int difficultySetter){
		if(difficultySetter == 1){//easy
			difficulty = 10;
		}else if(difficultySetter == 2){//med
			difficulty = 7;
		}else if(difficultySetter == 3){//hard
			difficulty = 4;
		}
	}

	private int getDifficulty(){
		return difficulty;
	}
}