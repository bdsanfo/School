import java.util.*;
public class NumberTest{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		Factorial factorial = new Factorial();

		double test1 = ((2*Math.sqrt(2))/9801); //Passed
		//System.out.println(test1);


		double fact = factorial.calculate(n);
		double fourFactorial = factorial.calculate(n*4);
		double summedSide = (fourFactorial*(1103+(26390*n))/((Math.pow(fact,4))*(Math.pow(396,(4*n))))); //passed
		System.out.println(summedSide);
	}
}