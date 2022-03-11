public class Fibonacci{
	
	private int fibToTheN;
	private int fib[];

	public Fibonacci(int n){

		fib = new int[n];
		fib[0] = 1;
		fib[1] = 1;

		for (int i=2; i<=fib.length-1; i++){
			
			fib[i] = fib[i-1] + fib[i-2];
			fibToTheN = fib[i];
		}
		
	}

	public int getCalculatedFibVal(){
		return fibToTheN;
	}
}