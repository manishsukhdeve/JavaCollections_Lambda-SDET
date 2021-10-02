package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo_2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);	// [X, Y, Z, A, B, C]
		
		al_dup.removeAll(al);
		System.out.println("After removing : " + al_dup);
		
//		Sort --- Collections.sort()	/ Collection class
		Collections.sort(al);
		System.out.println("After sorting : " + al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Reverce Order : " + al);
		
//		Shuffling -  Collections.shuffle(al_dup);
		Collections.shuffle(al);
		System.out.println("After shuffling : " + al);
		
	}

}
