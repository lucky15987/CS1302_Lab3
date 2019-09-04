/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab3
 * Instructor: Monisha Verma
 */

package Lab3;

import java.util.ArrayList;

public class ArrayListMethod 
{
	//create an array objects
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Double> list3 = new ArrayList<Double>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
		
	//method that returns null and compares two values and pick max.
		public static Integer max(ArrayList<Integer> list)
		{
			if (list.size() == 0)
			{
				return null;
			}
			Integer max = list.get(0);
			for (int i = 0; i < (list).size(); i++)
			{
				if (list.get(i) > max)
				{
					max = list.get(i);
				}
			}
			return max;		
		 }
		
	
		
		
		public static double sum(ArrayList<Double> list)
		{
			double sum = 0;
			for (int i = 0; i < list.size(); i++)
			{
				sum += list.get(i);
			}
			return sum;
		}
		
		public static ArrayList<Integer> union(ArrayList<Integer> list, ArrayList<Integer> list2)
		{
			
			ArrayList<Integer> list3 = list; 
			for (int i = 0; i < list2.size(); i++)
			{
				list3.add(list2.get(i));
			}
			return list3;
		}
		
		public String toString()
		{
			return ("Max Value for List 1: " + max(list) + "\nSum of List 2 is: " + sum(list3)) + "\nSum of List1 and List2: " + union(list, list2);
		
			
		}
}
