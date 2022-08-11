package facade;

public class HardDrive {
	char[] bootData = "Nyt lähtee Unixit tulille!".toCharArray();
	
	public char[] Read(int lba, int size) {
		char[] palautettava = new char[size];
		System.out.println("Luetaan bootdataa kovolta.");
		
		for(int i = lba; i < lba + size; i++) {
			palautettava[i-lba] = bootData[i];
		}
		
		return palautettava;
	}

}
