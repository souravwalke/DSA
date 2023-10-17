package Dsa;

import java.util.Arrays;

/**
 * You are given an array. The task is to reverse the array and print it
 * @author souravwalke
 *
 */
public class ReverseArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(reverseArray(nums.length,nums)));
	}
	
	private static int[] reverseArray(int n, int []nums) {
		findReverseArrayByRecursion(nums,0,n-1);
		return nums;
    }
	
	/**
	 * Swap the elements present  at the start and end index
	 * @param nums
	 * @param start
	 * @param end
	 * Complexity - O(n)
	 */
	private static void findReverseArrayByRecursion(int[] nums, int start, int end) {
		if(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			findReverseArrayByRecursion(nums,start+1,end-1);
		}
	}

}
