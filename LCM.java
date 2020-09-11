package Programs1;
import java.util.*;
public class LCM
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 2 numbers: ");
		int n1 = obj.nextInt(); //n1 = 12
		int n2 = obj.nextInt(); //n2 = 24
		int gcd = 1;
		for(int i=1 ; i<=n1 && i<=n2 ; i++)
		{
			if( n1%i==0 && n2%i==0)
				gcd = i; //gcd = 12
		}
		int lcm = (n1*n2)/gcd; //lcm = 24
		System.out.println("LCM = "+lcm);
	}

}
