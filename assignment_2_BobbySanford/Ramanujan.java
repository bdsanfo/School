import java.util.*;

public class Ramanujan{

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		Factorial factorial = new Factorial();
		double ramanujanPiValue =0;

		
		for (int k=0; k<=n; k++) {
			double kFactorial = factorial.calculate(k);
			double fourKFactorial = factorial.calculate(k*4);
			ramanujanPiValue = ramanujanPiValue + (fourKFactorial*(1103+(26390*k))/((Math.pow(kFactorial,4))*(Math.pow(396,(4*k)))));		
			System.out.println(ramanujanPiValue);
		}

		ramanujanPiValue = 1/(ramanujanPiValue * ((2*Math.sqrt(2))/9801));
		double javaPiVal = Math.PI;
		
		System.out.println("Pi according to the Ramanujan series: "+ramanujanPiValue);
		
		double percentError = Math.abs(((ramanujanPiValue-javaPiVal)/javaPiVal)*100) ;
		
		System.out.println("The percent error between Java's value and the Ramanujan series is: "+ percentError + " percent.");	
	}


}
