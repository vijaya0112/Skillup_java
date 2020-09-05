package Formula_Programs;
import java.util.*;
public class Positive_Negative 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter size :");
		int n = obj.nextInt();
		int a[] = new int[n];
		System.out.println("enter "+n +" values : ");
		for(int i=0;i<n;i++)
		{
			a[i] = obj.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(a[j]>0)
				System.out.println(a[j]+" is positive");
			else
				System.out.println(a[j]+" is negative");
				
						
		}
	}

}
