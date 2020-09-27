package programs4;

import java.util.Scanner;

public class Canada 
{
	//sum of squares of digits
	static int sum_sq(int n)
	{
		int sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			sum = sum + rem*rem;
			n = n/10;
		}
		return sum;
	}
	//sum of divisors
	static int sum_div(int n)
	{
		int div = 0;
		for(int i = 1; i<=(Math.sqrt(n));i++) //sqrt(125) = 11
		{
			if(n%i==0)
			{
				div = div + i + (n/i);
			}
		}
		return div-1-n;
	}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		int n = obj.nextInt();
		if(sum_sq(n) == sum_div(n))
			System.out.println("Canada number");
		else
			System.out.println("Not Canada number");

	}

}
