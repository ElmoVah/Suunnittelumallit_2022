package prototype;

public class Kello implements Cloneable{
	private Viisari tunti;
	private Viisari minuutti;
	private Viisari sekunti;
	
	public Kello() {
		tunti = new Viisari(24);
		minuutti = new Viisari(60);
		sekunti = new Viisari(60);
	}
	
	public void tick() {
		int apu = sekunti.tick();
		
		if (apu == 0) {
			apu = minuutti.tick();
			
			if (apu == 0) {
				tunti.tick();
			}
		}
	}
	
	
	/**
	 * Matalakopio, joka viittaa samoihin viisari olioihin
	 * kuin alkuperäinen.
	 */
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	/**
	 * Syväkopio, joka kloonaa myös viisarit.
	 */
	public Kello syvakopio() {
		Kello kello = null;
		try {
			kello = (Kello)super.clone();
			kello.tunti = (Viisari)this.tunti.clone();
			kello.minuutti = (Viisari)this.minuutti.clone();
			kello.sekunti = (Viisari)this.sekunti.clone();
			return kello;
		} catch (CloneNotSupportedException e) {
            return null;
        }
	}
	
	public String toString() {
		return tunti + ":" + minuutti + ":" + sekunti;
	}
}
