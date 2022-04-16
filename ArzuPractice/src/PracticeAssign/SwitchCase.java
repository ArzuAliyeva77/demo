package PracticeAssign;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// fevral qish fesilidir.
		Scanner scan =new Scanner(System.in);
		
  String ay = scan.next();
   switch (ay) {
   case "iyun":
   case "iyul":
   case "avqust":
	   System.out.println("indi yay fesilidir");
   break;
   case "dekabr":
   case "yanvar":
   case "ferval":
	   System.out.println("indi qish fesilidir");
	   break;
   case "yaz":
	   System.out.println("indi yaz fesilidir");
	   break;
   case "payiz":
	   System.out.println("indi payiz fesilidir");
 break;
	   
	   default:
		   System.out.println("hansi fesil oldugu belli deyil");
	
   
   }
   
   
		
		
	
	}

}
