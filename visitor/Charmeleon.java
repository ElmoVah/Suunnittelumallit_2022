package visitor;

public class Charmeleon extends PokemonState{
	private IVisitor evolvaaja = Evolvaaja.getInstance();
	
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
		evolvaaja.visit(this, pokemon);
	}

	@Override
	public void iske(Pokemon pokemon) {
		System.out.println("Charmeleon sylkee valtavia lieskoja! (7exp)");
		pokemon.setExp(7);
		evolvaaja.visit(this, pokemon);
	}

	@Override
	public void syo(Pokemon pokemon) {
		System.out.println("Charmeleon söi jäniksen! (1exp)");
		pokemon.setExp(1);
		evolvaaja.visit(this, pokemon);
	}
}
