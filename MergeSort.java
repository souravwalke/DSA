package Dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {8,3,1,4};
		
		MergeSortFunc merge = new MergeSortFunc();
		
		merge.mergeSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));	
	}
}

/**
 * Merge Sort Class with related functions
 * @author souravwalke
 *
 */
class MergeSortFunc {

	
	/**
	 * Runs recursively by dividing the array, sorting and merging
	 * @param arr
	 * @param low
	 * @param high
	 */
	protected void mergeSort(int[] arr, int low, int high) {
		
		if(low >= high) {
			return;
		}
		
		int mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);

	}
	
	/**
	 * Function to sort and merge arrays
	 * @param arr
	 * @param low
	 * @param mid
	 * @param high
	 */
	private void merge(int[] arr, int low, int mid, int high) {
		
		int left = low;
		int right = mid+1;
		List<Integer> tempList = new ArrayList<>();
		
		while(left <= mid && right <= high) {
			if(arr[left] < arr[right]) {
				tempList.add(arr[left]);
				left++;
			}
			else {
				tempList.add(arr[right]);
				right++;
			}
		}
		
		while(left <= mid) {
			tempList.add(arr[left]);
			left++;
		}
		
		while(right <= high) {
			tempList.add(arr[right]);
			right++;
		}
		
		for (int i = low; i <= high; i++) {
            arr[i] = tempList.get(i - low);
        }
		
	}

}