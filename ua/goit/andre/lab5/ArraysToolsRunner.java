package ua.goit.andre.lab5;

import java.util.Arrays;

public class ArraysToolsRunner {
		
	public static void main(String[] args) {		
		int[] testArray = {5, 2, 15, 78, 135, 1};
		System.out.println("Tested array: " + Arrays.toString(testArray)); 
		System.out.println("MinValue: " + IntArraysTools.minArrayValue(testArray));
		System.out.println("MaxValue: " + IntArraysTools.maxArrayValue(testArray));
		int[] resultArray = IntArraysTools.sortArray(testArray, true);
		System.out.println("In Ascending order: " + Arrays.toString(resultArray));
		resultArray = IntArraysTools.sortArray(testArray, false);
		System.out.println("In Descending order: " + Arrays.toString(resultArray));

	}
}
