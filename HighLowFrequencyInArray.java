package Dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HighLowFrequencyInArray {

	public static void main(String[] args) {
		
		int[] v = {1,1,3,3,1,3};
		System.out.println(Arrays.toString(getFrequencies(v)));
	}
	
	public static int[]  getFrequencies(int []nums) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		//Build a frequency map
		for(int num: nums) {
			int frequency = 1;
			if(map.containsKey(num)) {
				frequency = (map.get(num))+ 1;
			}
			map.put(num, frequency);
		}
		
		int maxFreq = 0, minFreq = nums.length;
        int maxEle = 0, minEle = 0;
		
        //Itterate the map and update the min and max frequency elements
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
		}
        
		return new int[]{maxEle,minEle};
    }

}
