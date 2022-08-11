package decorator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Kirjoittaja {

	public void tallennaTiedostoon(String teksti) throws FileNotFoundException {
		PrintWriter kirjoittaja = new PrintWriter("src/decorator/data.txt");
		kirjoittaja.println(teksti);
		kirjoittaja.close();
	}
}