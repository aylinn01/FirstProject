package com.neotech.lesson01;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {

		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(7);
		
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext());
		int num = iterator.next();
		if(num % 2==0) {
			iterator.remove();
			System.out.println(numbers);
		}
	}
}

