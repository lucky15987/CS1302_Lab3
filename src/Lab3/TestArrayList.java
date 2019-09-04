/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab3
 * Instructor: Monisha Verma
 */
package Lab3;

import java.util.Scanner;
import java.util.ArrayList;

public class TestArrayList 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//scanner input
		Scanner input = new Scanner(System.in);
		
		
		//create an array object
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Double> list4 = new ArrayList<Double>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		//ask for Array input (int)
		System.out.println("Enter a sequence of numbers ending with 0 [List 1]: ");
		Integer number = input.nextInt();
		
			for (int i = 0; i < 4; i++) 
			{
			list.add(number);
			number = input.nextInt();
			}
		
		
		//ask for Array input (double)
		System.out.println("Enter 5 numbers [List 2]: ");
		for (int i = 0; i < 5; i++)
		{
			list4.add(input.nextDouble());
		}
		
		//Ask for Array input (int)
		System.out.println("Enter 5 integer numbers [List 3]: ");
		fill(list2);
		input.close();
		
		//print out list
		System.out.println("\nThe highest number in List 1 is: " + ArrayListMethod.max(list));
		System.out.println("\nThe sum of all number in List 2 is: " + ArrayListMethod.sum(list4));
		System.out.println("\nThe Combined List 1 and List 3 is: " + ArrayListMethod.union(list, list2));
		
		
	}
	
	public static void fill(ArrayList<Integer> list3)
	{
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++)
		{
			list3.add(input.nextInt());
		}
		input.close();
	}

}
