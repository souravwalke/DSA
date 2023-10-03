package Dsa;

import java.util.Scanner;

/* Takes a character input and 
 returns 1 if Upper case, 
 0 if lower case and -1 if not a character. */
public class CheckCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//convert string input to ascii
		int asciiCode = (sc.next()).charAt(0);
		
		if(asciiCode >= 65 && asciiCode <= 96) {
			System.out.println("1");
		}
		else if(asciiCode >= 97 && asciiCode <= 122) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
		

	}

}
