import java.util.*;
/**
*@author Bobby Sanford
*/
public class States extends Countries implements Boundaries{
	private int area;
	private int distance;
	private int boundaryLength;
	private String capital;
	private String country;
	private String name;
	private ArrayList<String> cities;
	private ArrayList<String> neighbors;
	private ArrayList<String> borders;
	private boolean isCapital;

	/**
	*creates a blank States
	*/
	public States(){	
		//sets values =0
		//sets string names to =""
	}

	/**
	*creates a States
	*@param name name of state
	*@param capital name of capital
	*@param area value of area
	*/
	public States(String name,String capital,int area){	
		//Overload of States
		//sets the values to the parameters passed in
		//calls peekCapital();
	}
	
	/**
	*@param length sets the length of the boundary
	*/
	public void setBoundaryLength(int length){
		boundaryLength = length;
	}
	
	/**
	*@return area of state
	*/
	public int area(){
		return area;
	}

	/**
	*@return the country the state is located in
	*/
	public String country(){
		return country;
	}

	/**
	*the country the boundary separates
	*@param state added to the borders of the country
	*@return the bordering states
	*/
	public ArrayList<String> borderOf(String state){
		//finds the neighboring states and adds them to borders
		return borders;
	}
	
	/**
	*@return true if this is the capital
	*/
	public boolean checkCapital(){
		return isCapital;
	}
	
	/**
	*called by States() to check if this is the nation's capital
	*/
	private void peekCapital(){
		//checks if the capital of the state is the capital of the country
	}

	/**
	*@return name of capital
	*/
	public String capital(){
		return capital;
	}


	/**
	*@return length of the boundary
	*/
	public int boundaryLength(){
		return boundaryLength;
	}

	/**
	*@return cities located in the State
	*/
	public ArrayList<String> getCities(){
		return cities;
	}


	/**
	*@param state1 first state being compared
	*@param state2 second state being compared
	*@return distance between the two states
	*/
	public int distance(String state1,String state2){
		//calculates distance between the two states and sets distance to the absolute value of the difference
		return distance;
	}

	/**
	*adds a state that is a neighbor
	*@param state state that is a neighbor
	*@return neighbors to the state
	*/
	public ArrayList<String> neighbors(String state){
		return neighbors;
	}

	

}