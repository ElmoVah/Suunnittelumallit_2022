package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainA {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i <= 50; i++) {
			lista.add(i);
		}
		
		Iterator<Integer> iteraattori1 = lista.iterator();
		Iterator<Integer> iteraattori2 = lista.iterator();
		
		Lanka eka = new Lanka(iteraattori1, "eka");
		Lanka toka = new Lanka(iteraattori2, "toka");
		
		eka.start();
		toka.start();
		
		/**
		 * Kumpikin säie käy itsenäisesti läpi kaikki arvot.
		 */
	}

}
