package decorator;

import java.io.FileNotFoundException;

public interface IDataKasittelija {
	public void kirjoita(String data) throws Exception;
	public String lue() throws FileNotFoundException;
	public String getDescription();
}
