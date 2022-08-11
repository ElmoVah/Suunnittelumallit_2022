package composite;

public class Muistipiiri implements Laiteosa{
	private double hinta;
	
	public Muistipiiri(double hinta) {
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void lisaaLaiteosa(Laiteosa osa) {
		throw new RuntimeException("Muistipiiriin ei voi listä laiteosia");
	}

	@Override
	public void poistaLaiteosa(Laiteosa osa) {
		throw new RuntimeException("Muistipiiristä ei voi poistaa laiteosia");
	}
	
}
