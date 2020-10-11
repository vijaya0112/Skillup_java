package programs4;
import java.util.*;
public class Strong
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number ");
		int n = obj.nextInt(); //n=145
		int temp = n; //back up value
		int sum = 0;
		//identify each digit
		while(n!=0)
		{
			int rem = n%10;
			int fact = 1; 
			//to identify each digit factorial
			for(int i = 1 ; i <= rem ; i++)
			// we can also use while loop instead of for i.e while(i<=rem)
		    //if we use while we have to declare int i = 1
			{
				fact = fact*i;
			}
			sum = sum + fact;
			n = n/10; //to identify next digit
		}
        if(sum==temp)
        	System.out.println(temp +" is a strong number");
        else
        	System.out.println(temp +" is not a strong number");
	}
}
