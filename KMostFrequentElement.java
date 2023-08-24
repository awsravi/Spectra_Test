package com.test;

import java.util.*;

public class KMostFrequentElement {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9 };
		int k = 4;
		int[] res = getKMostFrequentElements(arr, k);
		System.out.print("K most frequent elements: ");
		for (int i = 0; i < k; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static int[] getKMostFrequentElements(int[] arr, int k) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
				(a, b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : a.getValue() - b.getValue());

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			pq.offer(entry);
			if (pq.size() > k) {
				pq.poll();
			}
		}

		int[] res = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			res[i] = pq.poll().getKey();
		}

		return res;
	}
}
