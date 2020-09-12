package programs2;
import java.util.*;
public class Fib_Or_Not {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number ");
		int n = obj.nextInt();
		int a = 0,b = 1,c = 0;
		while(c<n)
		{
			c = a+b;
			a = b;
			b = c;
		}
		if(c==n)
			System.out.println(n+ " is Fib number");
		else
			System.out.println(n+ "is not fib number");

	}

}
