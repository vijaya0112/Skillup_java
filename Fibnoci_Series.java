package programs2;
import java.util.*;
public class Fibnoci_Series
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n = obj.nextInt();
		int t1 = 0, t2 = 1;
		System.out.println("Fibonocci number upto "+n);
		System.out.print(t1 +" "+t2 );
		for(int i = 2;i<n;i++)
		{
			int sum = t1+t2;
			System.out.print(" "+sum);
			t1 = t2;
			t2 = sum;
		}
	}
}
