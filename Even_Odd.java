package pack2;
import java.util.*;
public class Even_Odd {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		  int num = obj.nextInt();
		if(num%2==0)
			System.out.println("even number : "+num);
		else
			System.out.println("odd number :"+num);
			
	}

}
