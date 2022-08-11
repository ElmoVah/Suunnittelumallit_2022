package composite;

public class Naytonohjain implements Laiteosa{
	private double hinta;
	
	public Naytonohjain(double hinta) {
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void lisaaLaiteosa(Laiteosa osa) {
		throw new RuntimeException("Näytönohjaimeen ei voi liittää muita osia!");
	}

	@Override
	public void poistaLaiteosa(Laiteosa osa) {
		throw new RuntimeException("Näytönohjaimesta ei voi poistaa osia!");
	}

}
