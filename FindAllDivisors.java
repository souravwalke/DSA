package Dsa;

import java.util.Scanner;

/**
 * Given a number, print all the divisors of the number.
 * @author souravwalke
 *
 */
public class FindAllDivisors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		findAllDivisors(num);
	}
	
	private static void findAllDivisors(int num) {
		
		for(int i=1; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				System.out.print(i + " ");
				if(num/i != i) {
					System.out.print(num/i + " ");
				}
			}
		}
	}

}
