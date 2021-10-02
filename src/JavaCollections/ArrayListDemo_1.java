package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo_1 {

	public static void main(String[] args) {
		
//		Declare ArrayList.
//		ArrayList al = new ArrayList();
//		ArrayList <Integer> al1 = new ArrayList <Integer> ();
//		ArrayList <String> al2 = new ArrayList <String> ();
		
//		List al = new ArrayList();	// List is a Interface.
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('a');
		al.add(true);
		System.out.println(al);		// [100, Welcome, 15.5, a, true]
		System.out.println("Number of elements in array list : " + al.size());	// 5
		al.remove(1);
//		al.remove("welcome");
		System.out.println("After removing element from array list " + al);
		
//		Insert a new element
//		add(index, object)
		al.add(2, "Python");
		System.out.println("After inseration : " + al);	// [100, 15.5, Python, a, true]
		
//		Retrive specific element
		System.out.println(al.get(2));	// Python
		
//		Change element / replace
		al.set(2, "Java");
		System.out.println("After replacing element : " + al);	// [100, 15.5, Java, a, true]
		
//		Search - contain()
		System.out.println(al.contains("Java"));
		System.out.println(al.contains("Phython"));
		
//		isEmpty()
		System.out.println(al.isEmpty());
		
//		1. for loop
		System.out.println("Reading elements using for loop.....");
		for (int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
//		2. for each loop
		System.out.println("for each loop : ");
		for (Object e : al )
		{
			System.out.println(e);
		}
		
//		3. iterator() mentod
		System.out.println("Reading elements using iterator method");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
