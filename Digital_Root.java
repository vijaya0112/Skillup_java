package programs4;
import java.util.*;
public class Digital_Root 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = obj.nextInt();
		int sum = 0;
		while(n>0 || sum>9)
		{
	      if(n==0)
		   { 
	    	  n = sum;
	    	  sum = 0;
		   }
			//sum of digits
			int rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println(sum);
	}
}
