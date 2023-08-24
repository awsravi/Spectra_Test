package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWords_3 {
	public static void main(String[] args) {

		String inputString = "Core java test and core java interview";

		List<String> frequencyOfWords = Arrays.asList(inputString.split(" "));
		
		
		Map<String, Long> output=frequencyOfWords.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(" frequencyOfWords :" + output);
		
		//frequencyOfWords :{core=1, java=2, test=1, and=1, interview=1, Core=1}
	}
}
