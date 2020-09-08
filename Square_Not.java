package Formula_Programs;
import java.util.*;
public class Square_Not
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int s = obj.nextInt();
		double sr = Math.sqrt(s);
		if((sr - Math.floor(sr))==0)
				System.out.println("Square number ");
		else 
			System.out.println("Not Square number ");
	}

}
