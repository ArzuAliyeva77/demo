package PracticeAssign;

public class MethodReturn4 {

	//2 soz daxil edilir uzunlugu boyuk olan String geriye return edilir. 
	
	public static void main(String[] args) {
		String soz1 = "hi";
		String soz2="hello";
		String UzunSoz = yoxla(soz1,soz2).toUpperCase();
		
		System.out.println(UzunSoz);
		
		
		
		

	}
	
	public static String yoxla(String word1 , String word2) {
		if(word1.length() > word2.length()) {
			return word1;
		}
		else {
			return word2;
		}
		
	}

}