package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * CircleArea.java
 * Calculate the area of a cirle.
 * March 26, 2024
 *
 * @author Christina Kemp
 */
public class CircleArea {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat areaFormat = new DecimalFormat("#.##");
    	double radius, area;
    	
    	System.out.print("Please enter the radius of the circle: ");
    	radius = sc.nextDouble();
    	
    	//Calculate the area of the circle - use methods from the Math class
    	
    	area=Math.pow(radius, 2)*Math.PI;
    	//Display a final sentence that tells the user the area of the circle (exactly 2 decimal places)
    	
    	System.out.printIn("The area of the circle is" + df.format(area)));
    	
    	sc.close();
    }
    
    
}