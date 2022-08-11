package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainB {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i <= 50; i++) {
			lista.add(i);
		}
		
		Iterator<Integer> iteraattori = lista.iterator();
		
		Lanka eka = new Lanka(iteraattori, "eka");
		Lanka toka = new Lanka(iteraattori, "toka");
		
		eka.start();
		toka.start();
		
		/**
		 * Säikeet käyvät yhdessä läpi listan kaikki arvot. 
		 * Eli säie ei käsittele lukuja, jotka toinen säie 
		 * on jo ehtinyt käsittelemään..
		 */
		
	}

}
