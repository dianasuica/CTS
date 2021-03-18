package ro.ase.csie.cts.seminar4.singleton;


//singleton => nu poate face decat o instanta
public class Elvis {
	
	//situatia1
	//public final static Elvis theTrueElvis = new Elvis();
	
	//situatia2 - facem atributul static privat si il trimitem printr-o metoda getInstance
	//private final static Elvis theTrueElvis = new Elvis();

	//situatia3 - nu initializam de la inceput cand porneste, ci doar cand este fol
	private static Elvis theTrueElvis;
	public static Elvis getInstance() {
		//situatia2
		//return theTrueElvis;
		
		//situatia 3
	    if(theTrueElvis == null) {
		   theTrueElvis = new Elvis();
		}
		
		return theTrueElvis;
	}
	
	private Elvis() {
		
	}
	
	
	public void sing() {
		System.out.println("Elvis is singing");
	}

}
