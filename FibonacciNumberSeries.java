package Dsa;

import java.util.Scanner;

public class FibonacciNumberSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		System.out.println("Fetched Fibonacci Number by Recursion: " + fetchFiboSeriesNumByRecuresion(input));
		
		System.out.println("Fetched Fibonacci Number by Looping: " + fetchFiboSeriesNumByLoop(input));
	}
	
	/**
	 * Perform Fibonacci Series Number using Recursion (Top-down Approach)
	 * Use n=0 and n=1 as base case
	 * Recuresively call the method until base case is reached
	 * Exponential time complexity - O(2^n)
	 * @param input
	 * @return
	 */
	private static int fetchFiboSeriesNumByRecuresion(int input) {
		
		if(input == 0) {
			return 0;
		}
		else if(input == 1) {
			return 1;
		}
		else {
			return fetchFiboSeriesNumByRecuresion(input-1)+fetchFiboSeriesNumByRecuresion(input-2);
		}
	}
	
	
	/**
	 * Perform Fibonacci Series Number using Loops (Bottom-up Approach)
	 * Use known values n=0 and n=1 and build until expected number
	 * Linear time complexity - O(n)
	 * @param input
	 * @return
	 */
	private static int fetchFiboSeriesNumByLoop(int input) {
		
		int[] array= new int[input];
		array[0] = 0;
		array[1] = 1;
		
		for(int i=2; i <= input; i++) {
			array[i] = array[i-1] + array[i-2];  
		}
		
		return array[input];
	}

}
