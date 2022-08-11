package adapter;

public class Adapteri extends JenkkiAuto implements EuroAuto{

	public Adapteri(String nimi, int maxNopeus, int massa) {
		super(nimi, maxNopeus, massa);
	}

	@Override
	public int getMaxNopeusKMH() {
		return (int) (super.getMaxNopeusMPH() * 1.609344);
	}

	@Override
	public int getMassaKG() {
		return (int)(super.getMassaLBS() * 0.45359237);
	}

}
