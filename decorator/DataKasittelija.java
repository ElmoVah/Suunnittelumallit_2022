package decorator;

import java.io.FileNotFoundException;

public class DataKasittelija implements IDataKasittelija {
	private Kirjoittaja tallentaja;
	private Lukija lukija;
	
	public DataKasittelija() {
		tallentaja = new Kirjoittaja();
		lukija = new Lukija();
	}

	@Override
	public void kirjoita(String data) throws Exception {
		tallentaja.tallennaTiedostoon(data);
	}

	@Override
	public String lue() throws FileNotFoundException {
		return lukija.lueTiedostosta();
	}

	@Override
	public String getDescription() {
		return "Datan käsittelijä";
	}

}
