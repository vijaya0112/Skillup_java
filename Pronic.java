package programs4;
import java.util.*;
public class Pronic
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int num = obj.nextInt();
		int x = 0;
		for(int i=0 ; i<num ; i++)
		{
			if(i*(i+1)==num)
			{
				x = 1; //pronic num
				break;
			}
		}
		if(x==1)
			System.out.println("Pronic number");
		else
			System.out.println("Not Pronic number");
	}
}
