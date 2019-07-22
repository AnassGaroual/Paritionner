package com.adneom.com.adneom;

import java.util.ArrayList;
import java.util.List;

public class Partition {

	public static List<List<Integer>> getPartition(List<Integer> numbers, int size) {

		// the variable result List of Lists of integers
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		// when the elements of the list are divisible by the max size of sublists
		if (numbers.size() % size == 0)
			result = getPartialPartition(numbers, size);

		else {
         // getting partition with sublists which size is equal to max size
			result = getPartialPartition(numbers.subList(0, numbers.size() - (numbers.size() % size)), size);
		// Adding remaining element to the last sublist 	
			result.add(numbers.subList(numbers.size() - (numbers.size() % size), numbers.size()));

		}
		return result;

	}

	// Static function that returns the result given the list divisible by the max size
	// and the max size
	static List<List<Integer>> getPartialPartition(List<Integer> numbers, int size) {
		// The result to be returned
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		// For Loop starting by 0 and iterating by max size
		for (int i = 0; i < numbers.size(); i += size) {
			// The sub List
			List<Integer> a = new ArrayList<Integer>();
			// Adding Element from initial list to sublist
			for (int j = 0; j < size; j++)
				a.add(numbers.get(i + j));
			// adding subList to List of lists
			result.add(a);
		}
		return result;
	}
}
