package amazon.code.practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedList {

	public static int[] merge(int[] a, int[] b) {

		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				answer[k] = a[i];
				i++;
			} else {
				answer[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < a.length) {
			answer[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			answer[k] = b[j];
			j++;
			k++;
		}

		return answer;

	}

	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> L1 = new ArrayList<Integer>(); ArrayList<Integer> L2 = new
		 * ArrayList<Integer>(); L1.add(3); L1.add(5); L1.add(7); L2.add(1); L2.add(3);
		 * L2.add(3); //Collections.addAll(list, 1, 2, 3, 4); System.out.println("L1 is"
		 * + L1); System.out.println("L2 is" + L2);
		 */
		int[] a = { 1, 2, 4, 5 };
		int[] b = { 3, 6, 7 };
		int[] lists = merge(a, b);
		System.out.println(Arrays.toString(lists));

	}

}
