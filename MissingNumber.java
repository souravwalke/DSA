package Dsa;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] inputArr = new int[] {9,6,4,2,3,5,7,0,1};
		
		System.out.println(missingNumber(inputArr));

	}
	
	//Brute-Force Approach
	private static int getMissingNumber(int[] inputArr) {
		
		int range = inputArr.length;
		Map<Integer,Integer> tmap = new HashMap<>();
		
		for(int i=0; i <= range; i++) {
			tmap.put(i, 0);
		}
		
		for(int i=0; i < range; i++) {
			tmap.put(inputArr[i], 1);
		}
		
		return tmap.entrySet().stream()
                .filter(entry -> entry.getValue() == 0)
                .map(Map.Entry::getKey)
                .findFirst().get();
	}
	
	//Optimal Solution
	private static int missingNumber(int[] nums) {
		
		int n = nums.length;
		int sum = (n*(n+1))/2;
		int arraySum=0;
		
		for(int i=0; i< n; i++) {
			arraySum+=nums[i];
		}
		
		return sum-arraySum;
	}

}
