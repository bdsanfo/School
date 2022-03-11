import java.util.*;
/**
*@author Bobby Sanford
*/
public class Cities extends States implements Boundaries{
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
	*creates a blank Cities
	*/
	public Cities(){	
		//sets values =0
		//sets string names to =""
	}

	/**
	*creates a Cities
	*@param name name of country
	*@param capital name of capital
	*@param area value of area
	*/
	public Cities(String name,String capital,int area){	
		//Overload of Cities
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
	*@return area of City
	*/
	public int area(){
		return area;
	}

	/**
	*@return the country the city is located in
	*/
	public String country(){
		return country;
	}

	/**
	*@return the state the city is located in
	*/
	public String State(){
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
	*@return true if this is the capital of the State
	*/
	public boolean checkCapital(){
		return isCapital;
	}

	/**
	*called by Cities() to 
	*/
	private void peekCapital(){
		//checks if the capital of the city is the capital of the state
	}

	/**
	*@return name of capital
	*/
	public String capital(){
		return capital;
	}

	/**
	*@param city1 first city being compared
	*@param city2 second city being compared
	*@return distance between the two cities
	*/
	public int distance(String city1,String city2){
		//calculates distance between the two cities and sets distance to the absolute value of the difference
		return distance;
	}

	/**
	*adds a city that is a neighbor
	*@param city city that is a neighbor
	*@return neighbors to the city
	*/
	public ArrayList<String> neighbors(String city){
		return neighbors;
	}

}