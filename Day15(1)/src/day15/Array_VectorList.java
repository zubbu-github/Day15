package day15;

import java.util.*;

public class Array_VectorList {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		
		Iterator<Integer> iterator = vector.iterator();
		while(iterator.hasNext()) {
			Integer n = iterator.next();
			System.out.println(n);
			if(n == 5)
			iterator.remove();		
		}
		System.out.println("*************************");
		System.out.println(vector);
	}

}
