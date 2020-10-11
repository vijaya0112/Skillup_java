package programs4;
import java.util.*;
public class Sastry
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		int n = obj.nextInt(); // n=183
		
		//to generate 183184
		String str = Integer.toString(n) + Integer.toString(n+1);
		//str= 183184
		int num = Integer.valueOf(str);
		double sr = Math.sqrt(num);
		if(sr - Math.floor(sr)==0)
			System.out.println("Sastry number");
		else
			System.out.println("Not Sastry number");
	}
}
