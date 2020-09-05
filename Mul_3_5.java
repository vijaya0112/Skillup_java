package Formula_Programs;
import java.util.*;
public class Mul_3_5 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 2 numbers :");
		int s = obj.nextInt();
		int t = obj.nextInt();
		System.out.println("multiples of 3 and 5 are :");
		for(int i=s;i<=t;i++)
		{
			if(i%3==0 && i%5==0)
			System.out.print(i+" ");
		}
	}
}
