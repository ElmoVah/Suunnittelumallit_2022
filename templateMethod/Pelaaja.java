package templateMethod;

public class Pelaaja {
	private int pisteet;
	private int id;
	public static int idCounter = 1;
	
	public Pelaaja() {
		pisteet = 0;
		id = idCounter;
		idCounter++;
	}
	
	public int addPisteet(int pisteet) {
		this.pisteet += pisteet;
		return this.pisteet;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPisteet() {
		return pisteet;
	}
}
