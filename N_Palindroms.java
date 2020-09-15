package programs3;
import java.util.*;
public class N_Palindroms 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter size");
		int s = obj.nextInt();
		int n[] = new int[s];
		System.out.println("enter "+s+" numbers");
        for(int i=0 ; i<s ; i++)
        {
        	n[i] = obj.nextInt();        
        }
        for(int i=0 ; i<s ; i++)
        {
        	int rev = 0;
        	int temp = n[i];
        	//reverse loop start from now
        	while(n[i]>0)
        	{
        		int rem = n[i]%10;
        		rev = (rev*10)+rem;
        		n[i] = n[i]/10;
        	}
        	if(temp==rev)
        		System.out.println(temp + " is palindrome number");
        	else
        		System.out.println(temp + " is not palindrome number");
        }}}
