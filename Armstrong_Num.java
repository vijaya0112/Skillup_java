package programs4;
import java.util.*;
public class Armstrong_Num 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		int n = obj.nextInt();
		int d=0; //counting digitd
		int sum=0; //for sum
		int temp = n;  //backup variable
		//loop for counting digits
		while(n>0)
		{
			int rem = n%10;
			d++;
			n = n/10;
		}
		n = temp; //while counting digits n value becomes '0' so we took backup variable
		//loop for sum of power of digits
		while(n>0)
		{
			int rem = n%10;
			sum = sum +(int)Math.pow(rem,d);
			//here we use 'int'data type because when we use 'Math.pow' we always get double so 
			//we kept 'int' 
			n = n/10;
		}
		if(temp==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}
}
