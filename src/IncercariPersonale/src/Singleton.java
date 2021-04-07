
public class Singleton {
	
	private static Singleton instanta = null;
	
	private Singleton() {
		instanta = new Singleton();
	}
	
	public Singleton getInstance() {
		if(instanta == null) {
			instanta = new Singleton();
		}
		return instanta;
	}

}
