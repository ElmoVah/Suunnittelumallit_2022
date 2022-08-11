package memento;

public class Main {
	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Pelaaja sebastian = new Pelaaja("Sebastian", arvuuttaja);
		Pelaaja daniel = new Pelaaja("Daniel", arvuuttaja);

		sebastian.start();
		daniel.start();
	}

}
