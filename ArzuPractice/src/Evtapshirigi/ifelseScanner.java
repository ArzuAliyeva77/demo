package Evtapshirigi;

import java.util.Scanner;

public class ifelseScanner {
	public static void main(String args[]) {
		
	
Scanner scan = new Scanner(System.in);

 System.out.println("Enter MAC M1 price in all stores");
 int m =scan.nextInt() ;

 if (m >=1000 && m<=1200) {
	 System.out.println("best buy"); 
 }
 else if (m >=1201 && m<=1500) {
	 System.out.println("walmart");
 }
	
 else {
	 
 System.out.println("this product in available in these stores");
 }
	


}
}