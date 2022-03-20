package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 14;
		boolean flag;
		for(int i=2;i<number; i++)
		{
			if (number%i==0)
			{
				flag = true;
			}
		}
		
			if (flag = true)
				System.out.println(number +" is a prime number");
			else
				System.out.println(number + " is a Not a Prime");

	}

}
