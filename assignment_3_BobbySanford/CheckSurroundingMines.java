public class CheckSurroundingMines{
	
	private int surroundingMines = 0;
	private int[][] tempGrid;
	private int location;

	public void setTempGrid(int[][] grid){
		tempGrid = grid;
	}

	public int recreateMineField(int rowLocation, int columnLocation,int rowLength, int columnLength){
		surroundingMines = 0;
		//System.out.println("iteration");
		
		
		//added -1 to all columnlength and row length

		if(rowLocation == 0){
			if(columnLocation ==0){//right,bottom right, bottom middle
				//System.out.println("Entered 1, row location:" + rowLocation + " columnLocation: " + columnLocation);
				if(tempGrid[rowLocation][columnLocation+1] == 1){
					surroundingMines+=1;
				}
				if(tempGrid[rowLocation+1][columnLocation+1] == 1){
					surroundingMines+=1;
				}
				if(tempGrid[rowLocation+1][columnLocation] == 1){
					surroundingMines+=1;
				}
			}
			else if (columnLocation!=0 && columnLocation != columnLength){//left,right,bottom left,bottom mid,bot right
				//System.out.println("Entered 2, row location:" + rowLocation + " columnLocation: " + columnLocation);
				if(tempGrid[rowLocation][columnLocation+1] == 1){//error on 5x4 and 3x3
					surroundingMines+=1;
				}
				if(tempGrid[rowLocation][columnLocation-1] == 1){
					surroundingMines+=1;
				}
				if(tempGrid[rowLocation+1][columnLocation-1] == 1){
					surroundingMines+=1;
				}
				if(tempGrid[rowLocation+1][columnLocation] == 1){
					surroundingMines+=1;
				}
				if(tempGrid[rowLocation+1][columnLocation+1] == 1){
					surroundingMines+=1;
				}
			}
		}
		else if(columnLocation==0){//dealing with first column
			//System.out.println("Entered 3, row location:" + rowLocation + " columnLocation: " + columnLocation);
			if(tempGrid[rowLocation-1][columnLocation] == 1){
				surroundingMines+=1;
			}
			if(tempGrid[rowLocation-1][columnLocation+1] == 1){
				surroundingMines+=1;
			}
			if(tempGrid[rowLocation][columnLocation+1] == 1){
				surroundingMines+=1;
			}
			if(tempGrid[rowLocation+1][columnLocation+1] == 1){
				surroundingMines+=1;
			}
			if(tempGrid[rowLocation+1][columnLocation] == 1){
				surroundingMines+=1;
			}	
		}
		

		else if(rowLocation != 0 && columnLocation != 0 && rowLocation != rowLength-1 && columnLocation != columnLength-1){
			//System.out.println("Entered 9, row location:" + rowLocation + " columnLocation: " + columnLocation);
			if(tempGrid[rowLocation-1][columnLocation-1] == 1){//error 2x2
				surroundingMines+=1;
				//System.out.println("Entered A");
			}

			if(tempGrid[rowLocation-1][columnLocation] == 1){
				surroundingMines+=1;
				//System.out.println("Entered B");
			}
			
			if(tempGrid[rowLocation-1][columnLocation+1] == 1){//error for 3x3
				surroundingMines+=1;
				//System.out.println("Entered C");
			}
			
			if(tempGrid[rowLocation][columnLocation-1] == 1){
				surroundingMines+=1;
				//System.out.println("Entered D");
			}
			if(tempGrid[rowLocation][columnLocation+1] == 1){
				surroundingMines+=1;
				//System.out.println("Entered E");
			}
			if(tempGrid[rowLocation+1][columnLocation-1] == 1){//error
				surroundingMines+=1;
				//System.out.println("Entered F");
			}
			if(tempGrid[rowLocation+1][columnLocation] == 1){
				surroundingMines+=1;
				//System.out.println("Entered G");
			}
			if(tempGrid[rowLocation+1][columnLocation+1] == 1){
				surroundingMines+=1;
				//System.out.println("Entered H");
			}
		}
		/*
		if(surroundingMines==0){
			surroundingMines =9;
		}
		*/
		return surroundingMines;					
	}
}




//recreate tempGrid
//check values
//pass back in
			
			/*		
			//top left		
			if(tempGrid[rowLocation-1][columnLocation-1] == 1){
				surroundingMines+=1;
			}
			
			//top middle
			if(tempGrid[rowLocation-1][columnLocation] == 1){
				surroundingMines+=1;
			}
			
			//top right
			if(tempGrid[rowLocation-1][columnLocation+1] == 1){
				surroundingMines+=1;
			}
			
			//left
			if(tempGrid[rowLocation][columnLocation-1] == 1){
				surroundingMines+=1;
			}
			
			//right
			if(tempGrid[rowLocation][columnLocation+1] == 1){
				surroundingMines+=1;
			}
			
			//bottom left
			if(tempGrid[rowLocation+1][columnLocation-1] == 1){
				surroundingMines+=1;
			}
			
			//bottom middle
			if(tempGrid[rowLocation+1][columnLocation] == 1){
				surroundingMines+=1;
			}
			
			//bottom right
			if(tempGrid[rowLocation+1][columnLocation+1] == 1){
				surroundingMines+=1;
			}
			*/