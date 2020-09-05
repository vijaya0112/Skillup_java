package Formula_Programs;
import java.util.*;
public class Reverse_Digits 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number : ");
		int num = obj.nextInt();
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println("reverse number = "+rev);
	}

}
