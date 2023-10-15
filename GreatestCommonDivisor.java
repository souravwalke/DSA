package Dsa;

import java.util.Scanner;

public class GreatestCommonDivisor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		gcdByBruteForce(num1,num2);
		
		gcdByBestApproach(num1, num2);
		
	}
	
	/**
	 * Simply traverse from 1 to min(a,b) and check for every number.
	 * Time Complexity - O(n)
	 * @param num1
	 * @param num2
	 */
	private static void gcdByBruteForce(int num1, int num2) {
		
		int ans = 1;
		
		for(int i=1; i <= Math.min(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				ans = i;
			}
		}
		
		System.out.println("GCD by Brute Force is "+ans);
		
	}
	
	private static void gcdByBestApproach(int num1, int num2) {
		
		while(num1 > 0 && num2 > 0) {
			if(num1 > num2) {
				num1 = num1%num2;
			}
			else {
				num2 = num2%num1;
			}
		}
		
		if(num1 == 0) {
			System.out.println("GCD By Best Approach is "+num2);
		}
		else {
			System.out.println("GCD By Best Approach is "+num1);
		}
		
	}

}
