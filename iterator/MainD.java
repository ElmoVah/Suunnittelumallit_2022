package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainD {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i <= 50; i++) {
			lista.add(i);
		}

		Iterator<Integer> iteraattori = lista.iterator();

		Lanka eka = new Lanka(iteraattori, "eka");
		
		eka.start();
		System.out.println("Iteraattorin poisto");
		iteraattori.remove();
		eka.start();

		/**
		 * Suorittaa iteroinnin loppuun virheilmoituksien kera,
		 * mutta ei suostu enää aloittamaan uutta iterointia.
		 */

	}
}
