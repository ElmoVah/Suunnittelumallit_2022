package builder;

public class McDonaldsBuilder implements IBurgerBuilder{
	private StringBuilder burgeri;
	
	public McDonaldsBuilder() {
		burgeri = new StringBuilder();
	}

	@Override
	public void lisaaSampyla() {
		burgeri.append("Sämpylä, ");
	}

	@Override
	public void lisaaPihvi() {
		burgeri.append("pihvi, ");
	}

	@Override
	public void lisaaSuolakurkku() {
		burgeri.append("suolakurkku ");
	}

	@Override
	public void lisaaMajoneesi() {
		burgeri.append("ja majoneesi");
	}

	@Override
	public Object getBurgeri() {
		return burgeri;
	}

}
