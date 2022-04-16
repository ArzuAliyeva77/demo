package PracticeAssign;

public class IfElse1 {

	public static void main(String[] args) {
		boolean bmw = true;
        boolean kia = false;
        boolean toyota = true;
        if (bmw && kia){
            System.out.println("yalnish tapdiniz");
        }
        else if (kia && toyota){
            System.out.println("yalnish tapdiniz");
        }
        else if (bmw && toyota){
            System.out.println("dogru tapdiniz");
        }

        else{
            System.out.println("artiq magazada mashin qalmamishdir hamisi satilib");
        }
		
		
		

	}

}
