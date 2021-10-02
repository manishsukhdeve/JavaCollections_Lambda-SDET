package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo_1 {
	
	public static void main(String[] args) {
		
//		Declare linked list
		
//		LinkedList l = new LinkedList();
//		LinkedList<Integer> l = new LinkedList<Integer>();
//		LinkedList<String> l = new LinkedList<String>();
		
		LinkedList l = new LinkedList();
		
//		Add elements into linked list
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		System.out.println(l);	// [100, welcome, 15.5, A, true, null]
		System.out.println(l.size());	// 6
		l.remove(3);	// index
		System.out.println("After removing new list " +l);

//		Insert / adding element in the middle of linked list
		l.add(3, "Java");
		System.out.println("After inserting element : "+l);
		
//		Retriving value / object
		System.out.println(l.get(3));	// Java
		
//		Change the value
		l.set(5, "X");
		System.out.println("After changing the value " + l);	// [100, welcome, 15.5, Java, true, X]
		
//		contains()
		System.out.println(l.contains("Java"));		// true
		System.out.println(l.contains("Python"));	// false
		
//		isEmpty()
		System.out.println(l.isEmpty());	// false
		
//		Reading elements from LinkedList using for loop
//		for (int i=0; i<l.size(); i++)
//		{
//			System.out.println(l.get(i));
//		}
		
//		for (Object e: l)
//		{
//			System.out.println(e);
//		}
		
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
