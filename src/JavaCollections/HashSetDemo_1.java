package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo_1 {

	public static void main(String[] args) {
		
// 		default capacity is 16 and load factor is 0.75.
		
//		HashSet hs = new HashSet();		// default capacity is 16.	
//		HashSet hs = new HashSet(100);	// initial capacity is 100.
//		HashSet hs = new HashSet(100, (float)0.90);
//		HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet hs = new HashSet();
		
//		Add objects / elements into HashSet
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);	// [null, A, 100, 16.4, Welcome, true]
		
//		remove()
		hs.remove(16.4); 
		System.out.println(hs);
		
//		contains()
		System.out.println(hs.contains("Welcome"));	// true
		System.out.println(hs.contains("welcome"));	// false
		
//		hs.isEmpty()
		System.out.println(hs.isEmpty());	// false
		
//		for (Object e : hs)
//		{
//			System.out.println(e);
//		}
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
