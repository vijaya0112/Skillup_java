package Formula_Programs;
import java.util.*;
public class Area_Pentagon 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter length of side : ");
		int s = obj.nextInt();
		System.out.println("enter apothem length : ");
		int a = obj.nextInt();
		float area = (float)(5/2)*s*a;
		System.out.println("area of pentagon = "+area);
	}

}
