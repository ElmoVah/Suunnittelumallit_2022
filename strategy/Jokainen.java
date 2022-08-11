package strategy;

import java.util.List;
import java.util.ListIterator;

public class Jokainen implements IStrategia {

	@Override
	public String listaMerkkijonoksi(List<String> lista) {	
		if (lista.size() == 0) {
			return "";
		}
		
		String tuloste = "";
		ListIterator<String> listaIteraattori = lista.listIterator();
		
		tuloste += listaIteraattori.next();
		
		while(listaIteraattori.hasNext()) {
			tuloste += "\n";
			tuloste += listaIteraattori.next();
		}
		
		return tuloste;
	}

}
