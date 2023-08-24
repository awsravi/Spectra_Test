package com.test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccringElements_2 {
public static void main(String[] args) {
	
	//Input: array [] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9}, K = 4
		//	Output: 5 11 7 10
	
	Integer[] arr= {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
	
	Map<Integer, Long> occe=Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(occe);
	
	//output :{2=1, 5=3, 7=2, 8=1, 9=1, 10=1, 11=2}
	
}
}
