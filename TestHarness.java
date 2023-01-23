
public class TestHarness {

	public static void GenerateSheep() {
		// public Sheep(String sName, String sFavColor, int sheight, int sweight)
		Sheep s = new Sheep("Bill", "Orange", 62,34);
		System.out.println("**** ----  Adding a sheep:");
		(ListOfSheep.SheepRoster).add(s);	
	}
	
}
