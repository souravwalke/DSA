package Dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an integer, return a sorted array containing factorial numbers 
 * less than or equal to that integer
 * @author souravwalke
 *
 */
public class FindFactorialNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		System.out.println(factorialNumbers(num).toString());
	}
	
	private static List<Long> factorialNumbers(long n){
		
		List<Long> resultList = new ArrayList<>();
		
		for(long i=1; i <= n; i++) {
			long factorialVal = findFactorial(i);
			if(factorialVal <= n) {
				resultList.add(i);
			}
			else {
				break;
			}
		}
		
		return resultList;
	}
	
	private static long findFactorial(long num) {
		
		if(num == 0 || num == 1) {
			return 1;
		}
		
		return num*findFactorial(num-1);
	}

}
