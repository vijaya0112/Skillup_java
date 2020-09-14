package programs3;
import java.util.*;
public class Even_Odd_Count
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter size");
		int s = obj.nextInt();
		int even = 0,odd = 0;
		int[] num = new int[s];
		System.out.println("enter "+ s +" values ");
		for(int i=0 ; i<s ; i++)
		{
			num[i] = obj.nextInt();
		}
        for(int i=0 ; i<s ; i++)
        {
        	if(num[i]%2==0)
        		even++;
        	else
        		odd++;
        }
        System.out.println("even number count = "+even);
        System.out.println("odd number count = "+odd);
	}
}
