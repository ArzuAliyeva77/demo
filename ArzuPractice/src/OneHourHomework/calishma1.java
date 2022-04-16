package OneHourHomework;

public class calishma1 {

	public static void main(String args[]) {
		int eded = 1245, tersi = 0;
        
 
        for(;eded != 0; eded /= 10) {//1
            int tek =eded % 10;//1
            tersi = tersi * 10 + tek;//5421
        }
        
        System.out.println("Sayının Tersi: " + tersi);

	}
	
	
	
}
