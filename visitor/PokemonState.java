package visitor;

public abstract class PokemonState {
	public abstract void liiku(Pokemon pokemon);
	public abstract void iske(Pokemon pokemon);
	public abstract void syo(Pokemon pokemon);
}
