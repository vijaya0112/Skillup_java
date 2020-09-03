package Formula_Programs;
import java.util.*;
public class Area_Equilateral_Triangle 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the side of triangle: ");
		int s = obj.nextInt();
		float a = (1.73f*s*s)/4;
		System.out.println("Area of Equilateral triangle = "+a);

	}

}
