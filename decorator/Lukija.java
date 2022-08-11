package decorator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lukija {

	public String lueTiedostosta() throws FileNotFoundException {
		String palautettava = "";
		Scanner tiedostonLukija = new Scanner(new File("src/decorator/data.txt"));
		while (tiedostonLukija.hasNextLine()) {
			palautettava += tiedostonLukija.nextLine();
		}
		return palautettava;
	}
}
