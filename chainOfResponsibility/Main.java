package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Toimitusjohtaja toimis = new Toimitusjohtaja();
		YksikonPaalikko paalis = new YksikonPaalikko();
		paalis.setSuccessor(toimis);
		Lahiesimies lahis = new Lahiesimies();
		lahis.setSuccessor(paalis);
		
		//Korotuspyyntö 7%
		lahis.processRequest(7);
		
		//Korotuspyyntö 4%
		lahis.processRequest(4);
		
		//Korotuspyyntö 1,5%
		lahis.processRequest(1.5);

	}

}
