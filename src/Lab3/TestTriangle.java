/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab3
 * Instructor: Monisha Verma
 */
package Lab3;

import java.util.Scanner;

public class TestTriangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//Scanner and inputs
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of side1 (ex. XX.X): ");
		double side1 = input.nextDouble();
		
		System.out.print("\nEnter length of side2 (ex. XX.X): ");
		double side2 = input.nextDouble();
		
		System.out.print("\nEnter length of side3 (ex. XX.X): ");
		double side3 = input.nextDouble();
		
		System.out.print("\nEnter a color: ");
		String color = input.next();
		
		
		System.out.println("\nIs the Triangle filled? (ENTER true or false): ");
		boolean filled = input.nextBoolean();
		
		//close scanner
		input.close();
		
		//create triangle object
				Triangle t1 = new Triangle(side1, side2, side3);
				t1.setColor(color);
				t1.setFilled(filled);
				
				
				//Output
				System.out.println("\n-------------------------------------------------");
				System.out.println(t1.toString());
				System.out.println("\nThe Perimeter of the Triangle is: " + t1.getPerimeter());
				System.out.println("\nThe Area of the Triangle is: " + t1.getArea());
				System.out.println("\nThe color you inputted was: " + t1.getColor());
				System.out.println("\nWas the Triangle filled?: " + t1.isFilled());

	}

}
