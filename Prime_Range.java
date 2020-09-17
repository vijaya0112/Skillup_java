package programs3;
import java.util.*;
public class Prime_Range
{
	public static void main(String[] args) 
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter 2 numbers :");
	int n1 = obj.nextInt();
	int n2 = obj.nextInt();
	System.out.println("Prime numbers betweem "+n1 +" and "+ n2);
	for(int i=n1+1 ; i<n2 ; i++)
	{
		int c=0;
		for(int n=i ; n>=1 ; n--)
		{
			if(i%n==0)
			{
				c = c+1;
			}
		}
	 if(c==2)
		 System.out.print(i+" ");	 
	}}}
