package Recursion;

public class Recursion3 {

	public static void main(String[] args) {
		paper(3);

	}

	public static void paper (int a) {
		if (a>0) {
			System.out.println("paper "  +a);
			a--;
			paper(a);
		}
		
	}
}
