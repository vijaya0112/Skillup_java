package Formula_Programs;
import java.util.*;
public class Simple_Interest
{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter p,n,r values :");
	int p = obj.nextInt();
	int n = obj.nextInt();
	int r = obj.nextInt();
	int si = (p*n*r)/100;
	System.out.println("Simple interest = "+si);
	}

}
