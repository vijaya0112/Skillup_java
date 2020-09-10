package Programs1;
import java.util.*;
public class Even_Odd_Count 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter size :");
		int s = obj.nextInt(); //s = 8
		int[] nums = new int[s];
		int even = 0 , odd = 0;
		System.out.println("enter "+ s +" values ");
		for(int i=0;i<s;i++) //0-7 ->8 values
		{
			nums[i] = obj.nextInt(); // 1 2 3 6 7 8 9 5
		}
        for(int i=0;i<s;i++) // 0-7 -> 8 values
        {
        	if(nums[i]%2==0) //if true even
        		even++;
        	else
        		odd++; // else odd 
        }
        System.out.println("even numbers count = "+even);
        System.out.println("odd numbers count = "+odd);
	}}
