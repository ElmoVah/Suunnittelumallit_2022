package memento;

import java.util.Collections;
import java.util.LinkedList;
import static java.util.Arrays.asList;

public class Pelaaja extends Thread{
	private String nimi;
	private Arvuuttaja arvuuttaja;
	private Object arvattava;
	private boolean arvannutOikein;
	private LinkedList<Integer> arvaukset;

	public Pelaaja(String nimi, Arvuuttaja arvuuttaja) {
		arvannutOikein = false;
		this.nimi = nimi;
		this.arvuuttaja = arvuuttaja;
		arvattava = arvuuttaja.liityPeliin(this);
		
		//Varmistaa, että samaa numeroa ei arvata kahdesti
		arvaukset = new LinkedList<>(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		Collections.shuffle(arvaukset);
	}
	
	public void run() {
		while(!arvannutOikein) {
			arvaa();
		}
	}

	public void arvaa() {
		if (!arvannutOikein) {
			int arvaus = arvaukset.pop();
			if (arvuuttaja.arvaa(arvattava, arvaus)) {
				System.out.println("Pelaajan " + nimi + " arvaus " + arvaus + " oli oikein!");
				arvannutOikein = true;
			} else {
				System.out.println("Pelaajan " + nimi + " arvaus " + arvaus + " oli väärin!");
			}
		}
	}

	public boolean getArvannutOiken() {
		return arvannutOikein;
	}
}
