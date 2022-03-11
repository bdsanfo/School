import java.io.*;

public class HuffmanNode implements Comparable<HuffmanNode>{
	private int frequency;
	private byte byteLocation;
	private HuffmanNode parent;
	private HuffmanNode zero;
	private HuffmanNode one;
	
	/*
	leaf nodes will have null children and a filled in byte variable
	internal nodes will have null byte variables
	root will have a null parent
	*/
	
	public HuffmanNode(byte byteLocation,int frequency){
		this.byteLocation = byteLocation;
		parent = null;
		zero = null;
		one = null;  
		this.frequency = frequency;
		//System.out.println("Frequency:"+frequency);
		//System.out.println("ByteLocation:"+byteLocation);
	}

	//Overloaded
	public HuffmanNode(HuffmanNode zero,HuffmanNode one){
		this.zero = zero;
		this.one = one;
	}
	
	public int compareTo(HuffmanNode node){
		return this.frequency - node.frequency;
	}

	public void increment(){
		frequency++;
		//System.out.println("Frequency:"+frequency);
	}

	public void setParent(){

	}

	public void setOne(){

	}

	public int getCount(){
		return frequency;
	}
}
