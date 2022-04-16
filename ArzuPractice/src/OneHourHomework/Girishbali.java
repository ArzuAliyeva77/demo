package OneHourHomework;

import java.util.Scanner;

public class Girishbali {
public static void main (String argString []) {
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Giris balinizi daxil edin");
		int girisBali=scanner.nextInt();
		if(girisBali>=34 && girisBali<=50) {
		System.out.println("Siz imtahanda istirak ede bilersiniz");	
		System.out.println("Imtahan baliniz daxil edin");
		int imtahanBali =scanner.nextInt(); 
		if(imtahanBali>=17 &&imtahanBali<=50) {
			System.out.println("siz imtahani kecdiniz semestr baglandi");
		}
		else {
			System.out.println("tessufki siz giris balini toplasanizda imtahandan kesildiniz");
		}
		}
		
		else {
			System.out.println("siz imtahana buraxilmirsiniz");
		}
	}
	
		
	}
	
	



	
	

