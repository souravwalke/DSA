package Dsa;

import java.util.Scanner;

public class PrintDatatypeSize {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String datatype = sc.next();
		
		int size = dataTypes(datatype);
		
		System.out.println(size);

	}
	
	public static int dataTypes(String type) {
		
		if(type.equalsIgnoreCase("Integer") || type.equalsIgnoreCase("Float")) {
			return 4;
		}
		else if(type.equalsIgnoreCase("Long") || type.equalsIgnoreCase("Double")) {
			return 8;
		}
		else {
			return 1;
		}
	}

}
