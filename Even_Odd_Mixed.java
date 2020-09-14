package programs3;
import java.util.*;
public class Even_Odd_Mixed 
{
	static void print(int num)
	{
		int n = num;
		int f = 1;  //even number
		while(num!=0)
		{
			int d = num%10;
			num = num/10;
			if(n%2==0 && d%2==0)
			{
				f = 2;  //mixed case
				break;
			}
			else if(n%2==1 && d%2==0)
			{ 
				f = 2; //mixed case
				break;
			}
		}
		if(f==1 && n%2==0)
			System.out.println("Full Even Number");
		else if(f==1 && n%2==1)
			System.out.println("Full Odd Number");
		else
			System.out.println("Mixed Number");
	}
	public static void main(String[] args) 
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number");
	int num = obj.nextInt();
	print(num);
	}
}
