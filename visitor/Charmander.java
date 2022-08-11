package visitor;

public class Charmander extends PokemonState{
	private IVisitor evolvaaja = Evolvaaja.getInstance();
	
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
		evolvaaja.visit(this, pokemon);
	}

	@Override
	public void iske(Pokemon pokemon) {
		System.out.println("Charmander sylkee pieniä lieskoja! (5exp)");
		pokemon.setExp(5);
		evolvaaja.visit(this, pokemon);
	}

	@Override
	public void syo(Pokemon pokemon) {
		System.out.println("Charmander mutusteli pokekeksin! (1exp)");
		pokemon.setExp(1);
		evolvaaja.visit(this, pokemon);
	}

}
