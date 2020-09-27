package programs4;
import java.util.*;
public class Abundant 
{
	static int display(int n)
	{
		int sum = 0;
		for(int i = 1 ; i <= (Math.sqrt(n)) ; i++) //1<=3 , sqrt(12) = 3
		{
			if(n%i==0)
			{
				sum = sum+i+n/i; //n/i is for next digit
			}	
		}
	//sum of proper factors
	sum = sum-n;
	return sum;
	}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		int n = obj.nextInt();
		if(display(n)>n)
			System.out.println("Abundant number");
		else
			System.out.println("Not Abundant number");
	}
}
