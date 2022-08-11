package templateMethod;

import java.util.ArrayList;
import java.util.Random;

/*
 * Pelaajat heittelevät vuoretellen noppaa. Voittaja on se, jonka yhteen laskettu silmäluku ylittää 25.
 */
public class Noppapeli extends Game {
	ArrayList<Pelaaja> pelaajat;
	private boolean peliLoppunut;
	private int voittaja;

	@Override
	void initializeGame() {
		this.pelaajat = new ArrayList<>();
		for (int i = 0; i < playersCount; i++) {
			pelaajat.add(new Pelaaja());
		}
		peliLoppunut = false;
		voittaja = 0;
	}

	@Override
	void makePlay(int player) {
		int heitto = new Random().nextInt(6) + 1;
		pelaajat.get(player).addPisteet(heitto);
		System.out.println("Pelaaja " + pelaajat.get(player).getId() + " Heitti silmäluvun: " + heitto
				+ ", pisteet yhteensä: " + pelaajat.get(player).getPisteet());
		if (pelaajat.get(player).getPisteet() >= 25) {
			peliLoppunut = true;
			voittaja = pelaajat.get(player).getId();
		}
	}

	@Override
	boolean endOfGame() {
		return peliLoppunut;
	}

	@Override
	void printWinner() {
		System.out.println("Pelaaja " + voittaja + " voitti pelin!");
	}

}
