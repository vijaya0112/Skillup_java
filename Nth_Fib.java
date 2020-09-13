package programs2;
import java.util.*;
public class Nth_Fib {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number ");
		int n = obj.nextInt();
		int a = 0,b = 1,c = 0;
		for(int i = 2 ; i<n ; i++)
		{
			c = a+b;
			a = b;
			b = c;
		}
		System.out.println("Fib num : "+c);
	}
}
