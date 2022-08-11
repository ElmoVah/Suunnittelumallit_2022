package abstractfactory;

public class AdidasTehdas implements ITehdas {

	@Override
	public IFarkut luoFarkut() {
		return new AdidasFarkut();
	}

	@Override
	public ITPaita luoTPaita() {
		return new AdidasTPaita();
	}

	@Override
	public IKengat luoKengat() {
		return new AdidasKengat();
	}

	@Override
	public ILippis luoLippis() {
		return new AdidasLippis();
	}

}
