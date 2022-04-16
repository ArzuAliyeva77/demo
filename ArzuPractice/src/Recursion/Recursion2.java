package Recursion;

public class Recursion2 {

	public static void main(String[] args) {
		day(3);
		
	}
	public static void day (int count) {
		System.out.println("Monday1");
		
		if (count ==0) {
		return ;
		}
		
		
		day(count - 1);
		System.out.println("Monday2");
	}
	}

	

