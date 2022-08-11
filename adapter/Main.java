package adapter;

public class Main {

	public static void main(String[] args) {
		/*
		 * Adapteri muuttaa amerikkalaiseet suureet nopeudessa
		 * ja massassa eurooppalaisiin suureisiin.
		 */
		EuroAuto pandaTrueno = new Adapteri("AE86 Trueno GT-Apex Hatchback", 120, 2000);
		
		System.out.println("Nimi: " + pandaTrueno.getNimi());
		System.out.println("Maksiminopeus: " + pandaTrueno.getMaxNopeusKMH() + "Km/h");
		System.out.println("Massa: " + pandaTrueno.getMassaKG() + "Kg");
	}

}
