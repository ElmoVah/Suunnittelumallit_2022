package command;

public class WhiteScreenDown implements Command{
private WhiteScreen ws;
	
	public WhiteScreenDown(WhiteScreen ws) {
		this.ws = ws;
	}
	
	@Override
	public void execute() {
		ws.down();
	}
}
