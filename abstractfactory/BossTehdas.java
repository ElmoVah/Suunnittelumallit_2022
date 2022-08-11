package abstractfactory;

public class BossTehdas implements ITehdas{

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
