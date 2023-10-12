package Dsa;

public class ReverseNumber {
	
	private static int reverse(int n) {
		
		long reverse =0;
		
		while (n!=0) {
			int rem = n%10;
			reverse = reverse*10 + rem;
			if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
				return 0;
			}
			n = n/10;
		}
		
		return (int)reverse;
	}

}
