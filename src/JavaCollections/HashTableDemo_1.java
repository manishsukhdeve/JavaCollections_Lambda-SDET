package JavaCollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo_1 {

	public static void main(String[] args) {

//		Hashtable t = new Hashtable();	// default capacity is 11, load factors 0.75
//		Hashtable t = new Hashtable(20);
//		Hashtable t = new Hashtable(initial capacity, fill ratio/load factor);
//		Hashtable <Integer, String> t = new Hashtable <Integer, String> ();
		
		Hashtable <Integer, String> t = new Hashtable <Integer, String> ();
		t.put(101, "Manish");
		t.put(102, "Nitin");
		t.put(103, "Smith");
//		t.put(null, "X");		// NullPointerException
//		t.put(104, null);		// NullPointerException
		System.out.println(t);
		System.out.println(t.get(101));
		
		t.remove(103);
		System.out.println(t);
		
		System.out.println(t.containsKey(101));
		System.out.println(t.containsKey(103));
		
		System.out.println(t.containsValue("Manish"));
		System.out.println(t.containsValue("Sumit"));
		
		System.out.println(t.isEmpty());
		
		System.out.println(t.keySet());
		
		System.out.println(t.values());
		
		for (int k : t.keySet())
		{
			System.out.println(k + "  " + t.get(k));
		}
		
		System.out.println("---");
		
//		Entry specific methods..args..
		for (Map.Entry entry : t.entrySet())
		{
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		System.out.println("---");
		
		Set s = t.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
			
	}

}
