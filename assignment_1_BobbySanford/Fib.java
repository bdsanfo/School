import java.util.*;

public class Fib {
	
	public static void main(String[] args){
		
		int n = Integer.parseInt(args[0]);

		Fibonacci fibonacciNum = new Fibonacci(n);

		int fibValue = fibonacciNum.getCalculatedFibVal();

		System.out.println(fibValue);
	}
}