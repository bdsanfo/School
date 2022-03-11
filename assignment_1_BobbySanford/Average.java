import java.util.*;

public class Average {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		double average = 0;
		double numberOfNumbers = 0;
		double sum = 0;
		ArrayList<Double> numbers = new ArrayList<Double>();

		System.out.println("Enter some numbers and once a negative number is input the average will be calculated.");
		
		while (scanner.hasNextDouble()){
			
			double i = scanner.nextDouble();
			
			if(i>0){
				numbers.add(i);
				numberOfNumbers ++;
			}
			else if(i<0){
				break;
			}
		}

		for (int x=0; x<numbers.size(); x++){
			sum += numbers.get(x);
		}

		average = (sum/numberOfNumbers);

		System.out.println("The average of your " + numberOfNumbers + " numbers entered is: "+ average);

	}
}		