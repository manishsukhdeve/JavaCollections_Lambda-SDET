package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo_2 {

	public static void main(String[] args) {

		LinkedList q = new LinkedList();
		
//		Adding elements		
//		add()	
//		offer()
		
		q.add("A");
		q.add("B");
		q.add("C");
//		q.offer("C");
		q.offer(100);	// allowed in queue (heterogenios data allowed.)
		q.offer("C");
		
		System.out.println(q);	// [A, B, C, 100, C]
//		Insertion order preserved and duplicate allowed.
		
//		get head element
//		element()
//		peek()
//		System.out.println(q.element());	// A	// java.util.NoSuchElementException		in case queue is empty then exception occures.
//		System.out.println(q.peek());		// A	// null
		
//		return and remove element from queue
//		remove()
//		poll()
//		System.out.println(q.remove());	// A	
//		System.out.println(q);			// [B, C, 100, C]	// java.util.NoSuchElementException
		
		System.out.println(q.poll());	// A			// null
		System.out.println(q);			// [B, C, 100, C]
		
//		Iterator itr = q.iterator();
//		while (itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		for (Object ele : q)
//		{
//			System.out.println(ele);
//		}

	}

}
