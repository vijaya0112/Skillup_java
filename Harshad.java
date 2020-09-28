package programs4;
import java.util.*;
public class Harshad
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int n = obj.nextInt();
		int c = n; //n = 18
		int sum = 0;
		while(c>0)
		{
			int rem = c%10;
			sum = sum+rem;
			c = c/10;
		}
        if(n%sum==0)
        	System.out.println("Harshad number");
        else
        	System.out.println("Not Harshad number");
	}
}
