package visitor;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		
		while(pokemon.getExp() < 200) {
			int toiminto = new Random().nextInt(3);
			switch (toiminto) {
			case 0:
				pokemon.liiku();
				break;
			case 1:
				pokemon.iske();
				break;
			case 2:
				pokemon.syo();
				break;
			}
		}
	}

}
