package main;

public class BinarySearch {
	public static void main(String[] args) {

		String[] arr = {"roshan","prashant","pranali","karishma","sagar","prachiti","samir" };
		String checkString = "roshan";
		int result = binarySearch(arr, checkString);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + " index " + result);
	}

	static int binarySearch(String[] arr, String checkString) {
		int len = 0, range = arr.length - 1;
		while (len <= range) {
			int midElement = len + (range - len) / 2;
			int res = checkString.compareTo(arr[midElement]);
			System.out.println(res);
			if (res == 0)
			{
				return midElement;

			}
			if (res < 0)
			{
				len = midElement + 1;

			}
			else
			{
				range = midElement - 1;

			}
		}

		return -1;
	}
}
