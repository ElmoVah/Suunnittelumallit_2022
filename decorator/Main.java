package decorator;

/**
 * Toteuta datan kirjoittaminen/lukeminen levylle/levyltä joko 
 * salakirjoitettuna tai ilman. Salakirjoitus ja purku dekoraattorilla.
 */

public class Main {

	public static void main(String[] args) throws Exception {
		IDataKasittelija suojaamaton = new DataKasittelija();		
		IDataKasittelija suojattu = new SalaavaDataKasittelija(suojaamaton);
		suojattu.kirjoita("Naulapyssy");
		System.out.println("Salattuna: " + suojaamaton.lue());
		System.out.println("Salaus purettu: " + suojattu.lue());
	}

}
