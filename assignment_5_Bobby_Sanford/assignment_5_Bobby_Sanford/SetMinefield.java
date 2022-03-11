public class SetMinefield {
	private int[][] gameboard = new int[10][10];

	public void configureBoard(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(gameboard[i][j]==1){
					gameboard[i][j]=10;
				}
			}
		}
	
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(gameboard[i][j]==10){
					continue;
				}else{
					gameboard[i][j] = countMines(i,j);
				}
				//System.out.print(gameboard[i][j]+",");
			}
			//System.out.println();
		}
	}
	
	public int countMines(int r,int c){
		int surroundingMines = 0;
		if(r!=9 && r!=0 && c!=9 && c!=0){
			if(check(r-1,c-1)==1) surroundingMines+=1;
			if(check(r-1,c)==1) surroundingMines+=1;
			if(check(r-1,c+1)==1) surroundingMines+=1;
			if(check(r,c-1)==1) surroundingMines+=1;
			if(check(r,c+1)==1) surroundingMines+=1;
			if(check(r+1,c+1)==1) surroundingMines+=1;
			if(check(r+1,c)==1) surroundingMines+=1;
			if(check(r+1,c-1)==1) surroundingMines+=1;
		}
		if(r==0 && c==0){
			if(check(r,c+1)==1) surroundingMines+=1;
			if(check(r+1,c)==1) surroundingMines+=1;
			if(check(r+1,c+1)==1) surroundingMines+=1;
		}
		if(r==0 && c ==9){
			if(check(r,c-1)==1) surroundingMines+=1;
			if(check(r+1,c)==1) surroundingMines+=1;
			if(check(r+1,c-1)==1) surroundingMines+=1;
		}
		if(r==9 && c==0){
			if(check(r-1,c)==1) surroundingMines+=1;
			if(check(r-1,c+1)==1) surroundingMines+=1;
			if(check(r,c+1)==1) surroundingMines+=1;
		}
		if(r==9 && c ==9){
			if(check(r-1,c)==1) surroundingMines+=1;
			if(check(r-1,c-1)==1) surroundingMines+=1;
			if(check(r,c-1)==1) surroundingMines+=1;
		}
		if(r!=0 && r!=9 && c==0){
			if(check(r-1,c)==1) surroundingMines+=1;
			if(check(r+1,c)==1) surroundingMines+=1;
			if(check(r-1,c+1)==1) surroundingMines+=1;
			if(check(r,c+1)==1) surroundingMines+=1;
			if(check(r+1,c+1)==1) surroundingMines+=1;
		}
		if(r!=0 && r!=9 && c==9){
			if(check(r-1,c)==1) surroundingMines+=1;
			if(check(r-1,c-1)==1) surroundingMines+=1;
			if(check(r,c-1)==1) surroundingMines+=1;
			if(check(r+1,c-1)==1) surroundingMines+=1;
			if(check(r+1,c)==1) surroundingMines+=1;
		}
		if(r==0 && c!=0 && c!=9){
			if(check(r,c-1)==1) surroundingMines+=1;
			if(check(r,c+1)==1) surroundingMines+=1;
			if(check(r+1,c-1)==1) surroundingMines+=1;
			if(check(r+1,c)==1) surroundingMines+=1;
			if(check(r+1,c+1)==1) surroundingMines+=1;
		}
		if(r==9 && c!=0 && c!=9){
			if(check(r,c+1)==1) surroundingMines+=1;
			if(check(r,c-1)==1) surroundingMines+=1;
			if(check(r-1,c-1)==1) surroundingMines+=1;
			if(check(r-1,c)==1) surroundingMines+=1;
			if(check(r-1,c+1)==1) surroundingMines+=1;
		}
		return surroundingMines;
	}

	public int check(int i,int j){
		int checkMine;
		if(gameboard[i][j]==10){
			checkMine=1;
		}else{
			checkMine=0;
		}
		return checkMine;
	}

	public void setBoard(int[][] tempBoard){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				gameboard[i][j] = tempBoard[i][j];
			}
		}
		configureBoard();
	}

	public int[][] getBoard(){
		return gameboard;
	}

}