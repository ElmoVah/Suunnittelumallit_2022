package state;

public class Pokemon {
	private PokemonState state;
	private int exp;
	
	public Pokemon() {
		this.state = Charmander.getInstance();
		this.exp = 0;
	}
	
	public void liiku() {
		state.liiku(this);
	}
	
	public void iske() {
		state.iske(this);
	}
	
	public void syo() {
		state.syo(this);
	}
	
	protected void evolvaa(PokemonState state) {
		this.state = state;
	}
	
	public void setExp(int exp) {
		this.exp += exp;
	}
	
	public int getExp() {
		return exp;
	}
	
}
