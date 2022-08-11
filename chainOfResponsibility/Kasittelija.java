package chainOfResponsibility;

public abstract class Kasittelija {
	private Kasittelija successor;
	
	public void setSuccessor(Kasittelija successor) {
		this.successor = successor;
	}
	
	public void processRequest(double korotus) {
		if(successor != null) {
			successor.processRequest(korotus);
		}
	}
}
