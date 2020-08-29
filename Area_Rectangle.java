package pack1;
import java.util.*;
public class Area_Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner obj = new Scanner(System.in);
      
     System.out.println("enter the length value");
       int L = obj.nextInt();
       
     System.out.println("enter the breadth value");
       int B  = obj.nextInt();
      
       int area = L*B;
     System.out.println("The area of rectangle is "+area);
	}

}
