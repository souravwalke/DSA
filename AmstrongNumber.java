package Dsa;

import java.util.Scanner;

/**
 * Given a number, check if it is Armstrong Number or Not.
 * Armstrong number are the numbers having the sum of digits raised to power no. of digits 
 * is equal to a given number.
 * @author souravwalke
 *
 */
public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(checkIsArmstrongNum(num));

	}
	
	private static Boolean checkIsArmstrongNum(int num) {
		
		//Convert number to string
		int len = Integer.toString(num).length();
		int sum = 0;
		int originalNum = num;
		
		while(num > 0) {
			int rem = num % 10;
			sum= (int) (sum + Math.pow(rem, len));
			num/=10;
		}
		
		return sum == originalNum;
	}

}
