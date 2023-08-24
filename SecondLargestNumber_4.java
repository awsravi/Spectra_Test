package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber_4 {

	public static void main(String[] args) {

		int[] numbers = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };

		int largest = Integer.MAX_VALUE;
		int secound = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				secound = largest;
				largest = numbers[i];

			} else if ((numbers[i] > secound && numbers[i] != largest))
				;
			secound = numbers[i];

		}
		System.out.println("SecondLargestNumber :" + secound);

	}

}

