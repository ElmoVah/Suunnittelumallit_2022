package prototype;

public class Viisari implements Cloneable{
	private int aika;
	private int max;

	public Viisari(int max) {
		this.max = max;
		aika = 0;
	}
	
	public int tick() {
		aika++;
		if(aika >= max) {
			aika = 0;
		}
		return aika;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
            return null;
        }

	}
	
	public String toString() {
		return aika < 10 ? "0" + aika : "" + aika;
	}
}
