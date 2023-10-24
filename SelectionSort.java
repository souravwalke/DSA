package Dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] inputArr = {15,28,17,12,9,6};
		
		doSelectionSort(inputArr);

	}
	
	/**
	 * Performs Selection Sorting on an Array
	 * @param arr
	 */
	private static void doSelectionSort(int[] arr) {
		
		System.out.println("Before Sorting "+ Arrays.toString(arr));
		
		for(int i=0; i < arr.length-1; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = min;
			arr[minIndex] = temp;

			System.out.println("After Round " +i+ "-->"+ Arrays.toString(arr));
		}
	}
	

}
