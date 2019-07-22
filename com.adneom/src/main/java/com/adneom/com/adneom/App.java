package com.adneom.com.adneom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Anass Garoual
 *
 */
public class App {

	private static Scanner in;

	public static void main(String[] args) {

		try {
			in = new Scanner(System.in);

			int size = in.nextInt();
			int t = in.nextInt();
			final List<Integer> numbers = new ArrayList<Integer>();
			for (int i = 0; i < t; i++)
				numbers.add(in.nextInt());

			System.out.println(Partition.getPartition(numbers, size));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
