package facade;

public class Memory {
	private char[] memory;
	
	public Memory() {
		memory = new char[250];
	}
	
	public void load(int position, char[] data) {
		System.out.print("Muistiin ladattu seuraava data: ");
		for(int i = position; i < position + data.length; i++) {
			memory[i] = data[i - position];
			System.out.print(memory[i]);
		}
		System.out.println("");
		
	}

}
