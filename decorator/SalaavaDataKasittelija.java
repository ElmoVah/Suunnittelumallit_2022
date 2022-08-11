package decorator;

import java.io.FileNotFoundException;

public class SalaavaDataKasittelija extends DataKasittelijaDecorator{
	private final int AVAIN = 5;
	
	public SalaavaDataKasittelija(IDataKasittelija dataKasittelijaToBeDeocarated) {
		super(dataKasittelijaToBeDeocarated);
	}
	
	public void kirjoita(String data) throws Exception {
		dataKasittelijaToBeDeocarated.kirjoita(salaa(data));
	}
	
	public String lue() throws FileNotFoundException {
		return puraSalaus(dataKasittelijaToBeDeocarated.lue());
	}
	
	public String getDescription() {
		return super.getDescription() + " salauksella";
	}
	
	private String salaa(String data) {
        char [] merkit = data.toCharArray();
        String palautettava = "";
        for(char merkki : merkit) {
            merkki += AVAIN; 
            palautettava += merkki;
        }
        return palautettava;
	}
	
	private String puraSalaus(String data) {
		  char [] merkit = data.toCharArray();
	        String palautettava = "";
	        for(char merkki : merkit) {
	            merkki -= AVAIN; 
	            palautettava += merkki;
	        }
	        return palautettava;
	}

}
