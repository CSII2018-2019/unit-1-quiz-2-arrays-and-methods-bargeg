//Genna Barge- Unit 1 Quiz 2 Programming Code 
import java.util.Arrays;

public class Unit1Quiz2Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//return a sorted array
//return the average of all the values in the array
//return the range of the values (highest - lowest).  
		double [] numbers = {45, 76, 56, 89, 32, 57, 89}; 
		Arrays.sort(numbers);
		System.out.printf("Modified array[]: %s ", Arrays.toString(numbers));
		double totalAvg = average(numbers);
		System.out.print("\nThe average is: " + totalAvg);
		range(numbers);
		
		
		
	
		
		
	}
	
	public static void range (double[] numbers) {
		int indexspots = numbers.length;
		double firstNum = numbers[0]; 
		double lastNum = numbers[indexspots-1];
		System.out.println("\nThe range is: " + firstNum + "-" + lastNum);
		
	}
	
	public static double average(double[] numbers) {
		double totalVal = 0;
		for (int i = 0; i < numbers.length; i++) {
			totalVal += numbers [i];
		}
		double average = (totalVal/numbers.length); 
		return average; 
		

}
}