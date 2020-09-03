package Formula_Programs;
import java.util.*;
public class Area_Hexagon 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter side length :");
		int s = obj.nextInt();
		double a = (3*Math.sqrt(3)*(s*s))/2;
		System.out.println("Area of hexagon = "+a);
	}

}
