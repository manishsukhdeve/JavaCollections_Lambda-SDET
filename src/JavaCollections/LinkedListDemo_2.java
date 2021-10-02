package JavaCollections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo_2 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList new_1 = new LinkedList();
		new_1.addAll(l);
		System.out.println(new_1);	// [X, Y, Z, A, B, C]
		
		new_1.removeAll(l);
		System.out.println(new_1);	// []
		
//		sort()	Collections.sort(collection);
		System.out.println("Before Sorting : " +l);	// [X, Y, Z, A, B, C]
		Collections.sort(l);
		System.out.println("After Sorting :  " +l);	// [A, B, C, X, Y, Z]
		
//		reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse order :  " +l);	// [Z, Y, X, C, B, A]
		
//		shuffling
		Collections.shuffle(l);
		System.out.println("After Shuffling :" + l);	// [A, Y, X, C, B, Z]
		
	}

}
