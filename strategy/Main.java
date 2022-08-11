package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		Collections.addAll(lista, "Kevät", "tuli", "lumi", "suli", "puro", "sano", "puli", "puli");
		
		IStrategia strategia = (IStrategia) new Jokainen();
		System.out.println(strategia.listaMerkkijonoksi(lista));
		
		strategia = new JokaToinen();
		System.out.println(strategia.listaMerkkijonoksi(lista));
		
		strategia = new JokaKolmas();
		System.out.println(strategia.listaMerkkijonoksi(lista));
	}
}
