package memento;

import java.util.Random;

public class Arvuuttaja {
	
	public Arvuuttaja() {}
	
	public Object liityPeliin(Pelaaja pelaaja) {
		return new Arvattava();
	}
	
	public synchronized boolean arvaa(Object oArvattava, int arvaus) {
		Arvattava aArvattava = (Arvattava) oArvattava;
		
		if (aArvattava.getLuku() == arvaus) {
			return true;
		}
		
		return false;
	}

	private class Arvattava{
		private int luku;
		
		public Arvattava() {
			luku = new Random().nextInt(9) +1;
		}
		
		public int getLuku() {
			return luku;
		}
	}
}
