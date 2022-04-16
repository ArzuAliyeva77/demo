package ReturnAndArray;

import java.util.Scanner;

public class Return4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter student information");
		String name = scan.next();
		String lastname = scan.next();
		String studentName = findEmail(name, lastname);
		System.out.println(studentName);
		
				
	}
public static String findEmail (String name, String lastname) {
	
	return "welcome to the college";
			
}

	
	
}
