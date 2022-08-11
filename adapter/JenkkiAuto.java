package adapter;

public class JenkkiAuto {
	private String nimi;
	private int maxNopeusMPH;
	private int massaLBS;
	
	public JenkkiAuto(String nimi, int maxNopeus, int massa) {
		this.nimi = nimi;
		maxNopeusMPH = maxNopeus;
		massaLBS = massa;
	}

	public String getNimi() {
		return nimi;
	}

	public int getMaxNopeusMPH() {
		return maxNopeusMPH;
	}

	public int getMassaLBS() {
		return massaLBS;
	}
	
}
