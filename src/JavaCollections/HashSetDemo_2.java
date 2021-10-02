package JavaCollections;

import java.util.HashSet;

public class HashSetDemo_2 {

	public static void main(String[] args) {

		HashSet<Integer> evenNumber = new HashSet<Integer>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet : " + evenNumber);	// HashSet : [2, 4, 6]
		
//		addAll();
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.addAll(evenNumber);
		numbers.add(10);
		System.out.println("New HashSet : " + numbers);
		
//		removeAll()
		numbers.removeAll(evenNumber);
		System.out.println(numbers);	// [10]

	}

}
