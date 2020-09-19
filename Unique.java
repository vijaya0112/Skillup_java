package programs4;
import java.util.*;
public class Unique
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a number");
		int n = obj.nextInt();
		int c , flag = 1; // c variable is to count how many times a digit repeats
		//flag is for condition purpose if flag =1 unique else if flag= 0 not unique
		int no = n;
		//checking 0 to 9 digits existing in a number 
		for(int i=0 ; i<=9 ; i++)
		{
			n = no; //in while loop n values goes to 0 so for backup we use no variable
			c = 0;
			//this loop is to check how many times a digit repeat
			while(n>0) 
			{
				int d = n%10;
				if(d==i) //if d!=i then c value wont increment
					c++;
				n = n/10;
			}
			if(c>1) //if a digit exists for multiple times , breaks for loop
			{
				flag = 0;  //not unique number
				break;
			}
		}
		if(flag==1) //unique
			System.out.println("Unique number");
		else
			System.out.println("Not Unique number");
	}
}
