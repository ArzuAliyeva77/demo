package Recursion;

public class Recursion1 {

	public static void main(String[] args) {
		Sayhello();

	}

	public static void Sayhello () {
		System.out.println("hi");
		Sayhello();
	}
}
