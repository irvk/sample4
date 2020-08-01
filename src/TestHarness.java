
public class TestHarness {

	public static void main(String[] args) {
		doStuff();
	}

	public static void doStuff() {
		
		//create an instance of a MusicOrganizer
		MusicOrganizer musicOrgainizer = new MusicOrganizer();
		
		//add elements to your musicOrganizer instance's list
		musicOrgainizer.addFile("Career Opportunities");
		musicOrgainizer.addFile("Death or Glory");
		musicOrgainizer.addFile("Every Little Bit Hurts");
		musicOrgainizer.addFile("Garageland");
		musicOrgainizer.addFile("I'm So Bored with the USA");
		musicOrgainizer.addFile("Janie Jones");
		musicOrgainizer.addFile("Junco Partner");
	 
		//what's at index 3..
		musicOrgainizer.listFile(3);
		
		
	}
	
}
