package Formula_Programs;
import java.util.*;
public class Area_Octagon 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter length of side :");
		float s = obj.nextFloat();
		float area = (float)(2*(1+Math.sqrt(2))*s*s);
		System.out.println("area of octagon = "+area);
	}

}
