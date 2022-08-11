package proxy;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Image doggo = new ProxyImage("Koirakuva");
		Image kisu = new ProxyImage("Kissakuva");
		Image seepra = new ProxyImage("Seeprakuva");
		
		ArrayList<Image> kuvat = new ArrayList<>();
		kuvat.add(doggo);
		kuvat.add(kisu);
		kuvat.add(seepra);
		
		for(Image kuva: kuvat) {
			kuva.showData();
		}
		
		for(Image kuva: kuvat) {
			kuva.displayImage();
		}
		
	}

}
