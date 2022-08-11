package state;

public class Charmeleon extends PokemonState{
	
	private static Charmeleon INSTANCE = null;
	
	private Charmeleon() {};
	
	public static Charmeleon getInstance() {
		if(INSTANCE == null)  INSTANCE = new Charmeleon(); 
		return INSTANCE;
	}
	
	@Override
	public void liiku(Pokemon pokemon) {
		System.out.println("Charmeleon juoksee vauhdikkaasti! (3exp)");
		pokemon.setExp(3);
		tarkistaEvolvaus(pokemon);
	}

	@Override
	public void iske(Pokemon pokemon) {
		System.out.println("Charmeleon sylkee valtavia lieskoja! (7exp)");
		pokemon.setExp(7);
		tarkistaEvolvaus(pokemon);
	}

	@Override
	public void syo(Pokemon pokemon) {
		System.out.println("Charmeleon söi jäniksen! (1exp)");
		pokemon.setExp(1);
		tarkistaEvolvaus(pokemon);
	}
	
	private void tarkistaEvolvaus(Pokemon pokemon) {
		if(pokemon.getExp() > 150) {
			pokemon.evolvaa(Charizard.getInstance());
			System.out.println("Charmeleon kehittyi Charizardiksi!");
		}
	}
}
