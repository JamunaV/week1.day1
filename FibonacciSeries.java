package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
	int range = 8,firstNum = 0,secNum = 1,sum; 
			

	// Print first number
	System.out.println(firstNum);
			
	// Iterate from 1 to the range
			
	for(int i = 1; i < range; i++) {
		sum = firstNum+ secNum;
		firstNum = secNum;
		secNum = sum;
		System.out.println(sum);
		}
	}

}
