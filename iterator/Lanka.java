package iterator;

import java.util.Iterator;

public class Lanka extends Thread{
	private Iterator<Integer> iteraattori;
	private String id;
	
	public Lanka(Iterator<Integer> iteraattori, String id) {
		this.iteraattori = iteraattori;
		this.id = id;
	}
	
	public void run() {
		while(iteraattori.hasNext()) {
			System.out.println(id + " iteroi alkion " + iteraattori.next());
		}
	}
	
}
