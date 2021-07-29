package main;

import java.util.Scanner;

public class FindPermutationsString {
	public static void main(String[] args) {
		System.out.print("Enter first number- ");
		Scanner scanInput = new Scanner(System.in);
		String str = scanInput.next();

		int n = str.length();
		FindPermutationsString findPermutation = new FindPermutationsString();
		findPermutation.permutation(str, 0, n - 1);
	}

	public static void permutation(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permutation(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
