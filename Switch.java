package pack2;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		int a = obj.nextInt();
		int b= obj.nextInt();
        System.out.println("a.Addition");
        System.out.println("b.Subtraction");
        System.out.println("c.Multiplication");
        System.out.println("d.Division");
        System.out.println("enter choice(a..d):");
        String ch = obj.next();
        switch(ch.charAt(0))
        {
        case 'a':
        	System.out.println("Addition = "+(a+b));
        	break;
        case 'b':
        	System.out.println("Subtraction = "+(a-b));
        	break;
        case 'c':
        	System.out.println("Multiplication = "+(a*b));
        	break;
        case 'd':
        	System.out.println("Division = "+(a/b));
        	break;
        default:
        	System.out.println("Invalid choice");
        }
	}

}
