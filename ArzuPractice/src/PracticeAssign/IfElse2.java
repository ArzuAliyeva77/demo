package PracticeAssign;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String st ="rainy";
		String str = "cold";
		String strd ="sunny";
		System.out.println("How is  the weather today?");
		String weather=sc.next();

		        if (weather ==st ){
		    System.out.println("you need umbrella");
		        }
		else if (weather==str){
		    System.out.println("you need wear something warm");
		}
		else if (weather==strd){
		    System.out.println("enjoy your day");
		}
		else{
		    System.out.println("it is better to stay at home");
		}

		    }
		
		
		
		

	}


