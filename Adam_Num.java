package programs4;
import java.util.*;
public class Adam_Num 
{
	public static void main(String[] args)  //main method
 	{
		Scanner obj  = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = obj.nextInt(); //num = 12
		int a = sq(num);
		int b = sq(rev(num));
		if(a==rev(b))
			System.out.println("Adam number");
		else
			System.out.println("Not Adam numbre");
	}
	static int sq(int num) //method for squaring
	{
		return (num*num);
	}
	static int rev(int num) //method for reverse
	{
		int r = 0;
		while(num>0)
		{
			int rem = num%10;
			r = r*10+rem;
			num = num/10;
		}
		return r;
	}
  }
