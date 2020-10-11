package programs4;
import java.util.*;
public class Unhappy_Num 
{
	//count number of digits
		static int count(int n)
		{
			int c = 0; //initially count of digits is 0
			while(n != 0)
			{
				c++;
				n = n/10;
			}
			return c;
		}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		int num = obj.nextInt();
		int n = num;
		int len = count(num); //l = length = no of digits = 3
		int sum = 0;
		//sum of digits powered with their pos
		while(num>0)
		{
			int rem = num%10;
			sum = sum + (int)Math.pow(rem,len);
			num = num/10;
			len--;
		}
		if(sum==n)
			System.out.println("Unhappy number");
		else
			System.out.println("Not Unhappy number");
	}  
}
