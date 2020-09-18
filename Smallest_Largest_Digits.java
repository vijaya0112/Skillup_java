package programs3;
import java.util.*;
public class Smallest_Largest_Digits
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int num = obj.nextInt();
		int snum , lnum;
		snum = lnum = num%10;
		while(num > 0)
		{
			int rem = num%10;
			if(rem > lnum)
				lnum = rem;
			else if(rem <= snum)
				snum = rem;
			num = num/10;
		}
		System.out.println("Smallest digit = "+snum);
		System.out.println("Largest digit = "+lnum);
	}
}
