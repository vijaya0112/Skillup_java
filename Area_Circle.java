package pack1;
import java.util.*;
public class Area_Circle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner obj = new Scanner(System.in);
      
      System.out.println("enter the value of radius");
        int r = obj.nextInt();
        
        float  area = 3.14f*r*r;
      System.out.println("The area of circle is "+area);
      
	}

}
