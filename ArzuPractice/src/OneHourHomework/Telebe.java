package OneHourHomework;

import java.util.Scanner;

public class Telebe {

	public static void main (String argString []) {
		
		Scanner scan =new Scanner(System.in);
		int a= scan.nextInt();
		if(a<51) {
			System.out.println("kesilmisiniz");
		}
		else if (a>=51 && a<=61) {
			System.out.println("e");
		}
	 else if(a>61 && a<=71) {
			System.out.println("d");
		}
	 else if (a>71&& a<=81) {
		 System.out.println("C");
		 
	 }
	 else if (a>81 && a<=91) {
		 System.out.println("b");
	 }
	 else if (a>91 && a<=100) {
		 System.out.println("a");
		 
	 }
		
	 else 
		 System.out.println("balinizi duzgun daxil edin");
		
	}
	
	
	
	
}
