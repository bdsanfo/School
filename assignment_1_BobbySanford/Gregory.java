import java.util.*;

public class Gregory {
	
	public static void main(String[] args){
		
		int n = Integer.parseInt(args[0]);
		
		Pi greg = new Pi(n);
		
		double gregValue = greg.getCalculatedGregoryPiValue();
		double javaPiVal = Math.PI;
		
		System.out.println("Pi according to the Gregory series: "+gregValue);
		
		double percentError = Math.abs(((gregValue-javaPiVal)/javaPiVal)*100) ;
		
		System.out.println("The percent error between Java's value and the Gregory series is: "+ percentError + " percent.");

	}

}