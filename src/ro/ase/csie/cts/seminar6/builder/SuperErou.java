package ro.ase.csie.cts.seminar6.builder;

public class SuperErou {
	
	private String nume;
	private int puncteViata;
	
	private boolean esteNegativ;
	boolean esteRanitGrav;
	
	private InterfataArma armaStanga;
	private InterfataArma armaDreapta;
	private InterfataSuperPutere superPutere;
	private InterfataSuperPutere superSuperPutere;
	
	//private deoarece trebuie sa fie accesibil doar din clasa
	//statica interna Builder
	//constr default trebuie obligatoriu privat, la cel cu parametri nu este obligatoriu
	private SuperErou() {
		
	}


	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapta, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	//obligatoriu static ca sa putem accesa builder prin clasa SuperErou, nu printr-un obiect SuperErou pe care oricum nu il avem
	public static class SuperErouBuilder {
		
		SuperErou supererou;
		
		//constructorul are parametrii care sunt obligatorii la construirea superEroului
		public SuperErouBuilder(String nume, int puncteViata) {
			this.supererou = new SuperErou();
			this.supererou.nume = nume;
			this.supererou.puncteViata = puncteViata;
		}
		
		public SuperErouBuilder esteNegativ() {
			this.supererou.esteNegativ = true;
			return this;
		}
		
		public SuperErouBuilder esteRanitGrav() {
			this.supererou.esteRanitGrav = true;
			return this;
		}
		
		public SuperErouBuilder adaugaArmaStanga(InterfataArma armaStanga) {
			this.supererou.armaStanga = armaStanga;
			return this;
		}
		
		public SuperErouBuilder adaugaArmaDreapta(InterfataArma armaDreapta) {
			this.supererou.armaDreapta= armaDreapta;
			return this;
		}
		
		public SuperErouBuilder adaugaSuperPutere(InterfataSuperPutere superPutere) {
			this.supererou.superPutere = superPutere;
			return this;
		}
		
		public SuperErouBuilder adaugaSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.supererou.superSuperPutere = superSuperPutere;
			return this;
		}
		
		//singura metoda care returneaza instanta de SuperErou
		//aceasta trebuie sa fie ultima apelata in main, dupa aceasta nu mai pot fi modificate atributele
		public SuperErou build() {
			return this.supererou;
		}
		
	}
	
	
	
}
