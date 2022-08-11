package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainC {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i <= 50; i++) {
			lista.add(i);
		}

		Iterator<Integer> iteraattori = lista.iterator();

		Lanka eka = new Lanka(iteraattori, "eka");

		eka.start();
		lista.add(4984);
		lista.add(235);

		/**
		 * Heittää virheilmoitusta: 
		 * Exception in thread "Thread-0" java.util.ConcurrentModificationException
		 */

	}

}
