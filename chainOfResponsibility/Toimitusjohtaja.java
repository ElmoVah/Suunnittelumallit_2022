package chainOfResponsibility;

public class Toimitusjohtaja extends Kasittelija{
	public void processRequest(double korotus) {
		System.out.println("Toimitusjohtaja käsitteli palkankorotuspyynnön. (+" + korotus + "%)");
	}
}
