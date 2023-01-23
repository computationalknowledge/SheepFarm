public class SheepManager {

	public static void main(String[] args) {
		run();
		System.out.println("finished");
	}
	
	static void run(){
		ListOfSheep SheepList = new ListOfSheep();
		TestHarness.GenerateSheep();
		ListOfSheep.ListTheSheep();
	}

	static int countTheSheep() {
		return (ListOfSheep.SheepRoster).size();
	}
}
