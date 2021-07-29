package main;

import java.util.Arrays;

public class AnagramDetection {
	public static void main(String[] args) {
		String stringOne = "heart";
		String stringTwo= "earth";
		char[] array1=stringOne.toLowerCase().toCharArray();
		char[] array2=stringTwo.toLowerCase().toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(Arrays.equals(array1, array2)) {
			System.out.println(  " Both strings are Anagrams strings ->" +stringOne  +stringTwo);
		}else {
			System.out.println("Both string are not anagram->" +stringOne  +stringTwo);
		}
	}
}
