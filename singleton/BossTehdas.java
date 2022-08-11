package singleton;

public enum BossTehdas implements ITehdas{
	INSTANCE;
	
	private BossTehdas() {}
	
	public static BossTehdas getInstance() {
		return INSTANCE;
	}

	@Override
	public IFarkut luoFarkut() {
		return new BossFarkut();
	}

	@Override
	public ITPaita luoTPaita() {
		return new BossTPaita();
	}

	@Override
	public IKengat luoKengat() {
		return new BossKengat();
	}

	@Override
	public ILippis luoLippis() {
		return new BossLippis();
	}

}
