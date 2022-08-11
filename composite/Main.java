package composite;

public class Main {

	public static void main(String[] args) {
		
		Emolevy emo = new Emolevy(137.50);
		Prosessori prossu = new Prosessori(267.89);
		emo.lisaaLaiteosa(prossu);
		
		Naytonohjain nayttis = new Naytonohjain(1299.99);
		emo.lisaaLaiteosa(nayttis);
		
		Muistipiiri muisti = new Muistipiiri(89.99);
		emo.lisaaLaiteosa(muisti);
		
		Verkkokortti verkkis = new Verkkokortti(44.75);
		emo.lisaaLaiteosa(verkkis);
		
		Kotelo koppa = new Kotelo(119.89);
		koppa.lisaaLaiteosa(emo);
		
		System.out.println(String.format("Kokoonpanon hinta on: %.2f€", koppa.getHinta()));
	}

}
