package singleton;

public enum AdidasTehdas implements ITehdas {
	INSTANCE;
	
	private AdidasTehdas() {}
	
	public static AdidasTehdas getInstance() {
		return INSTANCE;
	}
	
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
