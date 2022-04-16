package HomeRenovation;

public class Main {
public static void main (String [] args) {
	
	DiningRoom firstfloor = new DiningRoom();
	firstfloor.wallColor= "white";
	firstfloor.floorColor="gray";
	firstfloor.ceilingColor="white";
	firstfloor.windowsNumbers=2;
	
	Bedroom secondFloor = new Bedroom();
	secondFloor.wallColor="gray";
	secondFloor.floorColor="darkcholate";
	secondFloor.ceilingColor="white";
	secondFloor.windowsNumbers=2;
	
	Bathroom basement = new Bathroom();
	basement.wallColor= "lightpink";
	basement.floorColor="gray";
	basement.ceilingColor="white";
	basement.windowsNumbers=1;
	
	System.out.println(secondFloor.ceilingColor);
	System.out.println(firstfloor.wallColor);
	System.out.println(basement.windowsNumbers);
	
	infoHome(basement);
	TheHome(firstfloor);
	OwnHome(secondFloor);
}
	
	public static void infoHome(Bathroom basement) {
		System.out.println(basement.wallColor);
		System.out.println(basement.floorColor);
		System.out.println(basement.ceilingColor);
		System.out.println(basement.windowsNumbers);
			
	
}
	
public static void TheHome (DiningRoom firstFloor) {
	System.out.println(firstFloor.wallColor);
	System.out.println(firstFloor.floorColor);
	System.out.println(firstFloor.ceilingColor);
	System.out.println(firstFloor.windowsNumbers);
	
}
	public static void OwnHome (Bedroom secondFloor) {
		
		System.out.println(secondFloor.wallColor);
		System.out.println(secondFloor.floorColor);
		System.out.println(secondFloor.ceilingColor);
		System.out.println(secondFloor.windowsNumbers);
		
	}
	

}
