package abstractfactory;

public class Henkilo {
	private String nimi;
	private ITehdas tehdas;
	private IFarkut farkut;
	private ITPaita tPaita;
	private IKengat kengat;
	private ILippis lippis;
	
	public Henkilo(String nimi, ITehdas tehdas) {
		this.nimi = nimi;
		this.tehdas = tehdas;
	}
	
	public void pue() {
		System.out.println(nimi + " pukee yleen seuraavat vaatteet:");
		farkut = tehdas.luoFarkut();
		System.out.println(farkut);
		tPaita = tehdas.luoTPaita();
		System.out.println(tPaita);
		kengat = tehdas.luoKengat();
		System.out.println(kengat);
		lippis = tehdas.luoLippis();
		System.out.println(lippis);
	}

}
