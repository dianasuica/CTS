package ro.ase.csie.cts.seminar11.memento;

public class CaracterJoc {

	String denumire;
	int puncte;
	String abilitatiMagice;
	
	public CaracterJoc(String denumire, int puncte, String abilitatiMagice) {
		super();
		this.denumire = denumire;
		this.puncte = puncte;
		this.abilitatiMagice = abilitatiMagice;
	}

	public void ataca() {
		
	}
	
	public void seVindeca(int valoare) {
		this.puncte += valoare;
	}
	
	public void seDeplaseaza() {
		
	}
	
	//fiecare caracter poate sa isi creeze un memento pt salvare
	public MementoCaracterJoc salvare() {
		return new MementoCaracterJoc(denumire, puncte, abilitatiMagice);
	}
	
	//preluare din memento salvat
	public void incarcaSalvare(MementoCaracterJoc salvare) {
		this.denumire = salvare.denumire;
		this.puncte = salvare.puncte;
		this.abilitatiMagice = salvare.abilitatiMagice;
	}
}
