package programs4;
import java.util.*;
public class Zukarman
{
		//product of digits
		static int display(int n)
		{
			int p = 1; //product value initially taken as 1
			while(n!=0)
			{
				int rem = n%10;
				p = p*rem;
				n = n/10;
			}
			return p; //we used a return data type int so we write return p
		}
		
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = obj.nextInt();
		if(n%display(n)==0)
			System.out.println("Zukarman number");
		else
			System.out.println("Not Zukarman number");
	}
}
