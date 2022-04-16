package OneHourHomework;

import java.util.Scanner;

public class tekCut {

	public static void main(String[] args) {	// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("ededi daxil edin");
		int a = scanner.nextInt();
		if (a%2==1) {
			System.out.println("siz daxil etdiyiniz eded tekdir");
			
		}
		else if(a==0) {
			System.out.println("sizin daxil etdiyiniz eded sifirdir");
		}
		else {
			System.out.println("sizin daxil etdiyiniz eded cutdur");
		}
		
	}  
}
