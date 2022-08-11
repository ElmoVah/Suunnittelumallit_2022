package decorator;

import java.io.FileNotFoundException;

public abstract class DataKasittelijaDecorator implements IDataKasittelija{
	protected IDataKasittelija dataKasittelijaToBeDeocarated;
	
	public DataKasittelijaDecorator(IDataKasittelija dataKasittelijaToBeDeocarated) {
		this.dataKasittelijaToBeDeocarated = dataKasittelijaToBeDeocarated;
	}
	
	public void kirjoita(String data) throws Exception {
		dataKasittelijaToBeDeocarated.kirjoita(data);
	}
	
	public String lue() throws FileNotFoundException {
		return dataKasittelijaToBeDeocarated.lue();
	}
	
	public String getDescription() {
		return dataKasittelijaToBeDeocarated.getDescription();
	}
}
