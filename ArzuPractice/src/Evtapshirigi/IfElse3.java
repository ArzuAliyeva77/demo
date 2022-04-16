package Evtapshirigi;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int sarahage =scan.nextInt();
		int mirayage = 4;
		System.out.println("please enter student who can attend the school");
		
		if (sarahage > mirayage) {
		System.out.println("she can attend the school");
			
		}
		else if (sarahage < mirayage){
	System.out.println("she can attend the school");		
		
		}
			
		else {
			System.out.println("She can't attend the school");
		}
	}
}
		
	