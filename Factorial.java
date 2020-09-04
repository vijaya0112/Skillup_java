package Formula_Programs;
import java.util.*;
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n = obj.nextInt();
		int f = 1;
		for( int i=1;i<=5;i++)
		{
			f = f*i;
		}
		System.out.println("Factorial = "+f);
	}

}
