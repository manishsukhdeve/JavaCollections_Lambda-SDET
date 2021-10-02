package JavaCollections;

import java.util.LinkedList;

public class LinkedListDemo_3 {

	public static void main(String[] args) {

//		Linked list specific methos.
		
		LinkedList l = new LinkedList();
		
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		System.out.println(l);	// [dog, dog, cat, horse]
		
		l.addFirst("Tiger");
		l.addLast("Elephant");
		System.out.println(l);
		
		System.out.println(l.getFirst());	// Tiger
		System.out.println(l.getLast());	// Elephant
		
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first and last element " +l);
		
		
		
		
		
		
		
	}

}
