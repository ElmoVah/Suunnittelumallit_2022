package state;

public class Charmander extends PokemonState{
	
	private static Charmander INSTANCE = null;
	
	private Charmander() {};
	
	public static Charmander getInstance() {
		if(INSTANCE == null)  INSTANCE = new Charmander(); 
		return INSTANCE;
	}

	@Override
	public void liiku(Pokemon pokemon) {
		System.out.println("Charmander tallustelee reippaasti! (2exp)");
		pokemon.setExp(2);
		tarkistaEvolvaus(pokemon);
	}

	@Override
	public void iske(Pokemon pokemon) {
		System.out.println("Charmander sylkee pieniä lieskoja! (5exp)");
		pokemon.setExp(5);
		tarkistaEvolvaus(pokemon);
	}

	@Override
	public void syo(Pokemon pokemon) {
		System.out.println("Charmander mutusteli pokekeksin! (1exp)");
		pokemon.setExp(1);
		tarkistaEvolvaus(pokemon);
	}
	
	private void tarkistaEvolvaus(Pokemon pokemon) {
		if(pokemon.getExp() > 50) {
			pokemon.evolvaa(Charmeleon.getInstance());
			System.out.println("Charmander kehittyi Charmeleoniksi!");
		}
	}

}
