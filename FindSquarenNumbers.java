package dsaDay2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class squareInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a = ");
		int a = scanner.nextInt();

		System.out.println("b = ");
		int b = scanner.nextInt();

		System.out.println("The square numbers: " + findSquareNumbers(a, b));
	}

	public static List<Integer> findSquareNumbers(int min, int max) {

		List<Integer> squareIntegers = new ArrayList<>();

		for (int i = min; i <= max; i++) {
			double squareRoot = Math.sqrt(i);

			if (squareRoot == (int) Math.sqrt(i)) {
				squareIntegers.add(i);
			}
		}
		return squareIntegers;
	}
}
