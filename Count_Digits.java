package Programs1;
import java.util.*;
public class Count_Digits 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int num = obj.nextInt();
		int count = 0;
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		System.out.println("count of digits = "+count);
	}

}
