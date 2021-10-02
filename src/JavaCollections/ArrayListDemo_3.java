package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo_3 {
	
	public static void main(String[] args) {
		
//		This is just array.
		String [] arr = {"Dog", "Cat", "Elephant"};
		
		for (String value : arr)
		{
			System.out.println(value);
		}
		
//		Converting array into arraylist.
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}

}
