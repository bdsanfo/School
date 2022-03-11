import java.util.*;
/**
*@author Bobby Sanford
*/
public class Countries implements Boundaries{
	private int area;
	private int distance;
	private int boundaryLength;
	private String capital;
	private String country;
	private String name;
	private ArrayList<String> countries;
	private ArrayList<String> cities;
	private ArrayList<String> states;
	private ArrayList<String> neighbors;
	private ArrayList<String> borders;
	
	/**
	*creates a blank Countries
	*/
	public Countries(){	
		//sets values =0
		//sets string names to =""
	}

	/**
	*creates a Countries
	*@param name name of country
	*@param capital name of capital
	*@param area value of area
	*/
	public Countries(String name,String capital,int area){	
		//Overload of Countries. 
		//sets the values to the parameters passed in
	}

	/**
	*@return area of country
	*/
	public int area(){
		return area;
	}

	/**
	*@return name of capital
	*/
	public String capital(){
		return capital;
	}

	/**
	*@param length sets the length of the boundary
	*/
	public void setBoundaryLength(int length){
		boundaryLength = length;
	}

	/**
	*@return length of the boundary
	*/
	public int boundaryLength(){
		return boundaryLength;
	}

	/**
	*@return cities located in the country
	*/
	public ArrayList<String> getCities(){
		return cities;
	}

	/**
	*@return states locatated in the country
	*/
	public ArrayList<String> getStates(){
		return states;
	}

	/**
	*@return the country
	*/
	public ArrayList<String> getCountries(){
		return countries;
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
	*adds a country that is a neighbor
	*@param country country that is a neighbor
	*@return neighbors to the country
	*/
	public ArrayList<String> neighbors(String country){
		return neighbors;
	}

	/**
	*the country the boundary separates
	*@param country added to the borders of the country
	*@return the bordering countries
	*/
	public ArrayList<String> borderOf(String country){
		//finds the neighboring countries and adds them to borders
		return borders;
	}
}