package ro.ase.csie.cts.seminar6.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//VARIANTA 1 - CONSTRUCTOR DEFAULT
		//1 construire obiect
		//SuperErou superErou = new SuperErou();
		//2 initilizare atribute
		//superErou.nume = "Superman";
		//trebuie evitata construirea cu constructor default
		//deoarece se poate intampla sa uitam sa initializam ulterior atributele
		
		
		//VARIANTA 2 - CONSTRUCTOR PARAMETRI
		//SuperErou superErou2 = new SuperErou("Batman", 100, false, false, new Arma(), null, null, null);
		//nu este Clean - este greu de scris, inteles, modificat
		//atributul esteNegativ este deja false, nu are rost sa punem in constructor din nou ca false 
		
	}

}
