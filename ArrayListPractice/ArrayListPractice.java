/**
* ArrayListPractice
* This program has practice methods from in class
* @author Neil
* @version 1.0
*/

import java.util.ArrayList;

public class ArrayListPractice

{
	public static void main (String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(a.size());
		a.add(3);
		a.add(4);
	// 	System.out.println(a.size());
// 		System.out.println(a);
		
		Integer i = new Integer(5);
		a.add(i);
		// System.out.println(a);
		i = 6;
		// System.out.println(a);
		a.add(i);
		// System.out.println(a);
		a.add(0,-3);
		// System.out.println(a);
		a.set(a.size()-1,2);
		// System.out.println(a);
		
		a.add(a.size(),1);
	// 	System.out.println(a);
// 		
// 		System.out.println(a.size());
		
		a.remove(0);
		// System.out.println(a);
// 		System.out.println(a.size());
		a.add(3);
		a.add(3);
		a.add(4);
		System.out.println(a);
		
		remove(a, 3);
		System.out.println(a);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(2);
		b.add(0);
		b.add(-2);
		b.add(4);
		b.add(2);
		System.out.println(b);
		remove(b,2);
		System.out.println(b);
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("eye");
		s.add("abc");
		s.add("elephant");
		System.out.println(s);
		replace(s);
		System.out.println(s);		
	}
	/**
	* Purpose: This method removes all occurrences of the int n in the arraylist
	* The function works by going through the list and seeing if the int is equal to n
	* @param ArrayList<Integer> a - the array list
	* @param int n - the number to remove
	*/
	public static void remove (ArrayList<Integer> a,int n)
	{
		for (int i = 0; i<a.size(); i++)
		{
			if (a.get(i)==n)
			{
				a.remove(i);
				i = i-1;
			}
		}
	}
	
	/**
	* Purpose: This method removes all occurrences the letter "e" from the strings
	* of the array list, and it replaces the "e" with an "x"
	* The function works by going through the list and seeing if the character is 
	* 'e' and if it is, the word is changed so that 'x' replaces it
	* @param ArrayList<String> a - the arraylist with strings
	*/
	public static void replace (ArrayList<String> a)
	{
		for (int i= 0; i<a.size(); i++)
		{
			String word = a.get(i);
			for (int letter = 0; letter <word.length(); letter++)
			{
				if (word.charAt(letter)=='e')
				{
					word = word.substring(0,letter) + "x" + word.substring (letter+1);
				}
			}
			a.set(i,word);
		
		}
	
	}
	
}