package factorymethod;

public class Tohtori extends AterioivaOtus{

	public Juoma createJuoma() {
		return new Viini();
	}

}
