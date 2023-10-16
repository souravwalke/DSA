package Dsa;

import java.util.Scanner;

public class CheckPrime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(checkForPrime(num));
	}
	
	private static Boolean checkForPrime(int input) {
		
		int count = 0;
		
		for(int i=1; i<=Math.sqrt(input); i++) {
			if(input%i == 0) {
				count++;
				if(input/i != i) {
					count++;
				}
			}
			
			if(count > 2) {
				return false;
			}
		}
		
		return true;
	}

}
