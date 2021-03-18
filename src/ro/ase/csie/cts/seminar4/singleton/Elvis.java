package ro.ase.csie.cts.seminar4.singleton;

//singleton => nu poate face decat o instanta
public class Elvis {
	
	private Elvis() {
		
	}
	
	public final static Elvis theTrueElvis = new Elvis();
	
	public void sing() {
		System.out.println("Elvis is singing");
	}

}
