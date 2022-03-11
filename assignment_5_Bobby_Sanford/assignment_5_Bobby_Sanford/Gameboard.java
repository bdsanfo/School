public class Gameboard  {//controller
	Minefield minefield;
	private int[][] gameboard;// = new int[10][10];
	private int[][] flagLocations;// = new int[10][10];
	public Gameboard(){
		minefield = new Minefield();
		gameboard=new int[10][10];
		flagLocations = new int[10][10];
	}

	public String selectLocation(int i,int j){
		int location =0;
		String returnVal = "0";
		if(flagLocations[i][j]==0){
			location = minefield.getLocation(i,j);
			if(location!=10){
				returnVal = Integer.toString(location);
			}else{
				minefield.gameLost();
				returnVal = "B";
			}
		}
		System.out.println("gameboard value: " + location);
		return returnVal;
	}

	public void setFlag(int i,int j){
		flagLocations[i][j] = 1;
		System.out.println("Flag placed at "+i+","+j);
	}

	public void removeFlag(int i,int j){
		if(flagLocations[i][j]==1){
			flagLocations[i][j] = 0;
			System.out.println("Flag removed at "+i+","+j);
		}else{
			System.out.println("No flag to remove");
		}	
	}

	public int checkFlag(int i,int j){
		int check;
		if(flagLocations[i][j]==0){
			check = 0;
		}else{
			check = 1;
		}
		return check;
	}

	public int checkEnd(){
		if(minefield.checkLost()){
			return 1;
		}else if(minefield.checkWon()){
			return 2;
		}else{
			return 0;
		}
	}
}