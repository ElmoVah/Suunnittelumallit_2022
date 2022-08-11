package strategy;

import java.util.List;

public class JokaKolmas implements IStrategia{

	@Override
	public String listaMerkkijonoksi(List<String> lista) {
		if (lista.size() == 0) {
			return "";
		}
		
		String tuloste = "";
		
		for (int i = 0; i < lista.size(); i++) {
			if ( i % 3 == 0) {
				tuloste += "\n";
			}
			
			tuloste += lista.get(i);
			
			if (i % 3 != 2 && lista.size() - i != 1 ) {
				tuloste += " ";
			}
		}
		
		return tuloste;
	}

}
