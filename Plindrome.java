package programs3;
import java.util.*;
public class Plindrome
{
	public static void main(String[] args)
	{
     Scanner obj = new Scanner(System.in);
     System.out.println("enter number");
     int n = obj.nextInt();
     int num = n;
     int rev = 0;
     while(num>0)
     {
    	int rem = num%10;
    	rev = (rev*10)+rem;
    	num = num/10;
     }
     if(num==rev)
    	 System.out.println(n+" is palindrome number ");
     else
    	 System.out.println(n+" is not palindrome number ");
	}
}
