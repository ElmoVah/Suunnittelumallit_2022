package composite;

import java.util.ArrayList;

public class Kotelo implements Laiteosa{
	private ArrayList<Laiteosa> osat;
	private double hinta;

	public Kotelo(double hinta) {
		this.osat = new ArrayList<>();
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		double kokHinta = hinta;
		for(Laiteosa osa: osat) {
			kokHinta += osa.getHinta();
		}
		return kokHinta;
	}

	@Override
	public void lisaaLaiteosa(Laiteosa osa) {
		osat.add(osa);
	}

	@Override
	public void poistaLaiteosa(Laiteosa osa) {
		osat.remove(osa);
	}

}
