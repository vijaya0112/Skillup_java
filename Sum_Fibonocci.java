package programs2;
import java.util.*;
public class Sum_Fibonocci 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n = obj.nextInt();
		int t1 = 0 , t2 = 1 , t3 = 0 , sum = t1+t2;
		for(int i = 2 ; i<n ; i++)
		{
			t3 = t1+t2;
			sum = sum+t3;
			t1 = t2;
			t2 = t3;
		}
		System.out.print("sum of fib : "+sum);
	}
}
