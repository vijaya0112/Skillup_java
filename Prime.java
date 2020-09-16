package programs3;
import java.util.*;
public class Prime 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int n1 = obj.nextInt();
		//to check numbers from 1 to 10
		for(int i=1 ; i<n1 ; i++)
		{
			int c=0; //to check a number divisible count
			//to check a number is prime or not
			for(int n=i ; n>=1 ; n--)
			{
				if(i%n==0)
				{
					c = c+1;
				}
			} //end of inner loop
			if(c==2)
				System.out.print(i+" ");
		}//end of outer loop
	}
}
