package visitor;

public class Charizard extends PokemonState{
	
	private static Charizard INSTANCE = null;
	
	private Charizard() {};
	
	public static Charizard getInstance() {
		if(INSTANCE == null)  INSTANCE = new Charizard(); 
		return INSTANCE;
	}
	
	@Override
	public void liiku(Pokemon pokemon) {
		System.out.println("Charizard lentää hirmuista vauhtia! (5exp)");
		pokemon.setExp(7);
	}

	@Override
	public void iske(Pokemon pokemon) {
		System.out.println("Charizard sylkee infernaalisia lieskoja! (10exp)");
		pokemon.setExp(10);
	}

	@Override
	public void syo(Pokemon pokemon) {
		System.out.println("Charizard ahmi kokonaisen peuran! (2exp)");
		pokemon.setExp(2);
	}
}
