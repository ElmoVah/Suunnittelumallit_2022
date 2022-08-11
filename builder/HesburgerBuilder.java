package builder;

import java.util.ArrayList;

public class HesburgerBuilder implements IBurgerBuilder{
	private ArrayList<Object> burgeri;

	public HesburgerBuilder() {
		burgeri = new ArrayList<>();
	}

	@Override
	public void lisaaSampyla() {
		burgeri.add(new Sampyla());
	}

	@Override
	public void lisaaPihvi() {
		burgeri.add(new Pihvi());
	}

	@Override
	public void lisaaSuolakurkku() {
		burgeri.add(new Suolakurkku());
	}

	@Override
	public void lisaaMajoneesi() {
		burgeri.add(new Majoneesi());
	}

	@Override
	public Object getBurgeri() {
		return burgeri;
	}

}
