package prototype;

public class Main {

	public static void main(String[] args) {
		Kello kello = new Kello();

		for (int i = 0; i < 100; i++) {
			kello.tick();
		}

		Kello matala = (Kello) kello.clone();
		Kello syva = kello.syvakopio();

		System.out.println("Orginaali: " + kello + "\nMatala:" + matala + "\nSyvä:" + syva + "\n");

		for (int i = 0; i < 3; i++) {
			System.out.println("Tikataan orginaalia");
			kello.tick();
			System.out.println("Orginaali: " + kello + "\nMatala:" + matala + "\nSyvä:" + syva + "\n");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Tikataan matalaa");
			matala.tick();
			System.out.println("Orginaali: " + kello + "\nMatala:" + matala + "\nSyvä:" + syva + "\n");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Tikataan syvää");
			syva.tick();
			System.out.println("Orginaali: " + kello + "\nMatala:" + matala + "\nSyvä:" + syva + "\n");
		}
	}

}
