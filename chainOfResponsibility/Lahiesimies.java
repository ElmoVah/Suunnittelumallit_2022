package chainOfResponsibility;

public class Lahiesimies extends Kasittelija{
	int ylaraja = 2;
	
	public void processRequest(double korotus) {
		if(korotus <= ylaraja) {
			System.out.println("Lähiesimies käsitteli palkankorotuspyynnön. (+" + korotus + "%)");
		} else {
			System.out.println("Lähiesimies siirsi palkankorotyspyynnön yksikön päälikölle.");
			super.processRequest(korotus);
		}
	}
}
