package singleton;

public class Main {

	public static void main(String[] args) {
		ITehdas tehdas = AdidasTehdas.getInstance();
		
		Henkilo jasper = new Henkilo ("Jasper Java-koodaaja", tehdas);
		jasper.pue();
	}

}
