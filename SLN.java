package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SLN {
	public static void main(String[] args) {

		List<Integer> listNum = Arrays.asList(14, 46, 47, 86, 92, 52, 48, 36, 66, 85);
		List<Integer> order = listNum.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("DESC OrDER :" + order);
		Integer second = listNum.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(" SecondLargestNumber:" + second);
		// SecondLargestNumber:86
		List<Integer> asd=listNum.stream().sorted().collect(Collectors.toList());
		System.out.println(asd);
		Integer sln=listNum.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
		//System.out.println(sln);
		

	}
}
