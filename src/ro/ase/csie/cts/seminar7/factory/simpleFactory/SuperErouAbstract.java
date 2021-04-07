package ro.ase.csie.cts.seminar7.factory.simpleFactory;

public abstract class SuperErouAbstract {
	
	String nume;
	int puncteViata;
	
	public SuperErouAbstract(String nume, int puncteViata) {
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	public abstract void seDeplaseaza();

}
