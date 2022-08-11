package composite;

public class Prosessori implements Laiteosa{
	private double hinta;
	
	public Prosessori(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void lisaaLaiteosa(Laiteosa osa) {
		throw new RuntimeException("Prosessoriin ei voi liittää muita osia!");
	}

	@Override
	public void poistaLaiteosa(Laiteosa osa) {
		throw new RuntimeException("Prosessorista ei voi poistaa osia!");
	}

}
