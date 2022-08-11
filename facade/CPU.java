package facade;

public class CPU {

	public void Freeze() {
		System.out.println("CPU Jäässä...");
	}
	
	public void Jump(int position) {
		System.out.println("Siirrytään muistiosoitteeseen " + position);
	}
	
	public void Excecute() {
		System.out.println("Suoritetaan komentoa...");
	}

}
