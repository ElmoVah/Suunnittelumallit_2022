package abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		Class c = null;
		ITehdas tehdas = null;

		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/abstractfactory/tehdas.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			c = Class.forName(properties.getProperty("tehdas"));
			tehdas = (ITehdas)c.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Henkilo jasper = new Henkilo ("Jasper Java-koodaaja", tehdas);
		jasper.pue();
	}

}
