package chainOfResponsibility;

public class YksikonPaalikko extends Kasittelija {
	int ylaraja = 5;
	
	public void processRequest(double korotus) {
		if(korotus < ylaraja) {
			System.out.println("Yksikön päälikkö käsitteli palkankorotuspyynnön. (+" + korotus + "%)");
		} else {
			System.out.println("Yksikön päälikkö siirsi palkankorotyspyynnön toimitusjohtajalle.");
			super.processRequest(korotus);
		}
	}
}
