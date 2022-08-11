package builder;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		IBurgerBuilder hese = new HesburgerBuilder();
		IBurgerBuilder makki = new McDonaldsBuilder();
		
		Director wolttiKuski = new Director(hese);
		
		ArrayList<Object> heseBurgeri = (ArrayList<Object>) wolttiKuski.buildBurger();
		
		System.out.println("Hese:");
		for(Object osa: heseBurgeri) {
			System.out.println(osa);
		}
		
		wolttiKuski.setBuilder(makki);
		StringBuilder makkiBurgeri = (StringBuilder) wolttiKuski.buildBurger();
		
		System.out.println("\nMäkkäri:");
		System.out.println(makkiBurgeri);

	}

}
