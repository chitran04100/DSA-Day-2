package dsaDay2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddTimes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 100, 400, 15, 3, 15, 15 };

		System.out.println("All numbers that appear odd times in an array: ");
		System.out.println(findOddOccurenceNumbers(numbers));
	}

	public static List<Integer> findOddOccurenceNumbers(int[] array) {
		List<Integer> oddArray = new ArrayList<>();
		int count[] = new int[10000];

		for (int a : array) {
			count[a]++;
		}

		for (int a : array) {
			if (count[a] % 2 == 1) {
				oddArray.add(a);
			}
		}
		return oddArray;
	}
}