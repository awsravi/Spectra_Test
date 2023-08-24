package com.test;

import java.util.Arrays;

public class MissingPosiIntegers_1 {
	public static void main(String[] args) {

		// Given an unsorted integer array number, return the smallest missing positive integer.

		// unsorted integer
		int[] number = { 2, 3, 4, -1, -2 };
		int smallestMissingPositive = getSmallestMissingPositive(number);
		System.out.println("The smallest missing positive integer is: " + smallestMissingPositive);
	}

	public static int getSmallestMissingPositive(int[] number) {

		int j = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] <= 0) {
				int temp = number[i];
				number[i] = number[j];
				number[j] = temp;
				j++;
			}
		}

		int n = number.length - j;
		for (int i = j; i < number.length; i++) {
			int index = Math.abs(number[i]) - 1 + j;
			if (index < number.length && number[index] > 0) {
				number[index] = -number[index];
				n--;
			}
		}

		for (int i = j; i < number.length; i++) {
			if (number[i] > 0) {
				return i - j + 1;
			}
		}

		return n + 1;
	}

	}


