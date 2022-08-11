package command;

public class Main {
	public static void main(String[] args) {
		
		WhiteScreen ws = new WhiteScreen();
		Command cmdDown = new WhiteScreenDown(ws);
		WallButton buttonDown = new WallButton(cmdDown);
		Command cmdUp = new WhiteScreenUp(ws);
		WallButton buttonUp = new WallButton(cmdUp);
		
		buttonUp.push();
		buttonDown.push();
	}	
}
