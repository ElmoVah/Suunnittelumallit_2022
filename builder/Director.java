package builder;

public class Director {
	private IBurgerBuilder builderi;
	
	public Director(IBurgerBuilder builderi) {
		this.builderi = builderi;
	}
	
	public Object buildBurger() {
		builderi.lisaaSampyla();
		builderi.lisaaPihvi();
		builderi.lisaaSuolakurkku();
		builderi.lisaaMajoneesi();
		return builderi.getBurgeri();
	}
	
	public void setBuilder(IBurgerBuilder builderi){
		this.builderi = builderi;
	}
}
