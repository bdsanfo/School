import java.util.*;
/**
*@author Bobby Sanford
*/
public class Rivers implements Boundaries{
	private int area;
	private int boundaryLength;
	private String name;
	private ArrayList<String> neighbors;
	
	/**
	*creates a blank river
	*/
	public Rivers(){	
		//sets values =0
		//sets string names to =""
	}

	/**
	*creates a Rivers
	*@param name name of river
	*@param boudaryLength length of the boundary
	*@param area value of area
	*/
	public Rivers(String name,int boundaryLength,int area){	
		//Overload of Rivers
		//sets the values to the parameters passed in
	}

	/**
	*@return length of the boundary
	*/
	public int boundaryLength(){
		return boundaryLength;
	}

	/**
	*@param length sets the length of the boundary
	*/
	public void setBoundaryLength(int length){
		boundaryLength = length;
	}

	/**
	*@return area of river
	*/
	public int area(){
		return area;
	}

	/**
	*adds a river that is a neighbor
	*@param river river that is a neighbor
	*@return neighbors to the river
	*/
	public ArrayList<String> neighbors(String river){
		return neighbors;
	}

}