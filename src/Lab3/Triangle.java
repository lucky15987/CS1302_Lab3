/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab3
 * Instructor: Monisha Verma
 */
package Lab3;

public class Triangle extends SimpleGeometricObject 
{
	//data fields
	private double side1;
	private double side2;
	private double side3;
	
	//no-arg constructor
	public Triangle()
	{
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	
	//constructor for specified triangle
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//getter for sides
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	//methods for getArea(), getPerimeter()
	 public double getArea()
	{
		double p = (getPerimeter() / 2);
		return (Math.sqrt( (p * (p - side1)) * (p - side2) * (p - side3)));
	}
	
	
	public double getPerimeter()
	{
		return (side1 + side2 + side3);
	}
	
	public String toString()
	{
		return "Triangle: side1 = " + side1 + 
				" side2 = " + side2 + " side3 = " + side3;
	}
}
