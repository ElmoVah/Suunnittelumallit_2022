package visitor;

public class Evolvaaja implements IVisitor{
	
	private static Evolvaaja INSTANCE = null;
	
	private Evolvaaja() {}
	
	public static Evolvaaja getInstance() {
		if(INSTANCE == null)  INSTANCE = new Evolvaaja(); 
		return INSTANCE;
	}
	
	@Override
	public void visit(Charmander charmander, Pokemon pokemon) {
		if(pokemon.getExp() > 50) {
			pokemon.evolvaa(Charmeleon.getInstance());
			System.out.println("Charmander kehittyi Charmeleoniksi!");
		}
	}

	@Override
	public void visit(Charmeleon charmeleon, Pokemon pokemon) {
		if(pokemon.getExp() > 150) {
			pokemon.evolvaa(Charizard.getInstance());
			System.out.println("Charmeleon kehittyi Charizardiksi!");
		}
	}

	@Override
	public void visit(Charizard charizerd, Pokemon pokemon) {
		//Ei tarvita evolvaamisessa, koska viimeinen muoto
	}


}
