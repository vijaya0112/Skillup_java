package pack1;
import java.util.*;
public class Area_Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner obj = new Scanner(System.in);
     
    System.out.println("enter the height:");
      int h = obj.nextInt();
    
    System.out.println("enter the base:");
      int b = obj.nextInt();
     
      float a = (b*h)/2f;
    System.out.println("area of triangle :"+a);	}

}
