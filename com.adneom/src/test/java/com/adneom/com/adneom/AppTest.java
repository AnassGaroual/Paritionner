package com.adneom.com.adneom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for Partition.
 */
public class AppTest {

	@Test
	public void shouldReturnPartition() {
		try {
			// The initial List
			final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
			// The max size of the sublists
			int size = 3;
			List<List<Integer>> result = Partition.getPartition(numbers, size);
			assertEquals(result.size(), 4);
			assertEquals(new Integer(1), result.get(0).get(0));
			assertEquals(new Integer(2), result.get(0).get(1));
			assertEquals(new Integer(3), result.get(0).get(2));
			assertEquals(new Integer(4), result.get(1).get(0));
			assertEquals(new Integer(5), result.get(1).get(1));
			assertEquals(new Integer(6), result.get(1).get(2));
			assertEquals(new Integer(7), result.get(2).get(0));
			assertEquals(new Integer(8), result.get(2).get(1));
			assertEquals(new Integer(9), result.get(2).get(2));
			assertEquals(new Integer(10), result.get(3).get(0));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Should not have thrown any exception" + e);
		}
	}

	@Test
	public void shouldReturnPartialPartition() {
		try {
			// The initial List
			final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
			// The max size of the sublists
			int size = 5;
			List<List<Integer>> result = Partition.getPartialPartition(numbers, size);
			assertEquals(result.size(), 2);
			assertEquals(new Integer(1), result.get(0).get(0));
			assertEquals(new Integer(2), result.get(0).get(1));
			assertEquals(new Integer(3), result.get(0).get(2));
			assertEquals(new Integer(4), result.get(0).get(3));
			assertEquals(new Integer(5), result.get(0).get(4));
			assertEquals(new Integer(6), result.get(1).get(0));
			assertEquals(new Integer(7), result.get(1).get(1));
			assertEquals(new Integer(8), result.get(1).get(2));
			assertEquals(new Integer(9), result.get(1).get(3));
			assertEquals(new Integer(10), result.get(1).get(4));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Should not have thrown any exception" + e);
		}
	}
}
