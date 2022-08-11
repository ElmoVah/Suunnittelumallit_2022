package command;

public class WhiteScreenUp implements Command{
	private WhiteScreen ws;
	
	public WhiteScreenUp(WhiteScreen ws) {
		this.ws = ws;
	}
	
	@Override
	public void execute() {
		ws.up();
	}
}
