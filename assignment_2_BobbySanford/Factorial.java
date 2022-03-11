public class Factorial {

	public static long calculate(long n){

		if(n==0){
			return n+1;
		}
		else if(n < 0){
			System.out.println(n+" cannot be a negative number.");
			System.exit(0);
		}
		else if (n > 20){
			System.out.println(n+" is too large. Try a value less than 20.");
			System.exit(0);
		}
		
		return (n*calculate(n-1));
	}

	public static void main(String[] args){
		
		System.out.print("Factorial.calculate(0) returned "+ Factorial.calculate(0));
		if(Factorial.calculate(0)== 1){
			System.out.println(" Test passed");
		}
		else {
			System.out.println(" Test failed");
		}
		
		System.out.print("Factorial.calculate(5) returned "+ Factorial.calculate(5));
		if(Factorial.calculate(5) == 120){
			System.out.println(" Test passed");
		}
		else{
			System.out.println(" Test failed");
		}
	}	
}