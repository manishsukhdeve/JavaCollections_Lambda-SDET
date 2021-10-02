package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo_1 {

	public static void main(String[] args) {

//		HashMap m = new HashMap();
		HashMap <Integer,String> m = new HashMap <Integer,String>();
		
//		HashMap m = new HashMap();
		m.put(101, "Manish");
		m.put(102, "Nitin");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");	
		m.put(103, "X");		// Overwrite
		m.put(106, "Nitin");	// Duplicate value can be allowed.
		System.out.println(m);	// {101=Manish, 102=Nitin, 103=Scott, 104=Mary, 105=Tye}
		
		System.out.println(m.get(105));
		System.out.println(m.get(101));
		
		m.remove(103);	// Remove pair from HashMap
		System.out.println(m);
		
		System.out.println(m.containsKey(101));	// true
		System.out.println(m.containsKey(103));	// false
		
		System.out.println(m.containsValue("Mary"));	// true
		System.out.println(m.containsValue("Y"));		// false
		
		System.out.println(m.isEmpty());	// false
		
		System.out.println(m.keySet());		// Returns all the available. keys
		for (Object i : m.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println(m.values());		// Returns all the values.
		for (Object i:m.values())
		{
			System.out.println(i);
		}
		
//		for (Object i:m.keySet())
//		{
//			System.out.println(i + "   " + m.get(i));
//		}
		
		System.out.println(m.entrySet());	// Returns all the entry set.
		
//		Entry Methods
//		*************
//		for (Map.Entry entry : m.entrySet())
//		{
//			System.out.println(entry.getKey() + "   " + entry.getValue());
//		}

//		iterator()	
		Set s = m.entrySet();	
		Iterator itr = s.iterator();
			while (itr.hasNext())
			{
				Map.Entry entry =  (Entry) itr.next();
				System.out.println(entry.getKey() + "  " + entry.getValue());
			}
	}

}
