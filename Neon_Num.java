package programs4;
import java.util.*;
public class Neon_Num 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = obj.nextInt();
		int sq = n*n;
		int sum = 0;
		while(sq>0)
		{
			int rem = sq%10;
			sum = sum + rem;
			sq = sq/10;
		}
		if(sum==n)
			System.out.println("Neon number");
		else
			System.out.println("Not Neon number");
	}
}
