package composite;

public class Verkkokortti implements Laiteosa{
	private double hinta;
	
	public Verkkokortti(double hinta) {
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void lisaaLaiteosa(Laiteosa osa) {
		throw new RuntimeException("Verkkokorttiin ei voida lisätä laiteosia!");
	}

	@Override
	public void poistaLaiteosa(Laiteosa osa) {
		throw new RuntimeException("Verkkokortista ei voida poistaa laiteosia!");
	}

}
