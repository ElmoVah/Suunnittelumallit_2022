package strategy;

import java.util.List;

public class JokaToinen implements IStrategia{

	@Override
	public String listaMerkkijonoksi(List<String> lista) {
		if (lista.size() == 0) {
			return "";
		}
		
		String tuloste = "";
		String[] sanat = new String[lista.size()];
		
		for (int i = 0; i < lista.size(); i++) {
			sanat[i] = lista.get(i);
		}
		
		for (int i = 0; i < sanat.length; i++) {
			if ( i % 2 == 0) {
				tuloste += "\n";
			}
			
			tuloste += sanat[i];
			
			if (i % 2 != 1 && sanat.length - i != 1 ) {
				tuloste += " ";
			}
		}
		
		return tuloste;
	}

}
