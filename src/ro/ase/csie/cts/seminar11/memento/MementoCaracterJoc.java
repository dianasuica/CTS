package ro.ase.csie.cts.seminar11.memento;

import java.util.Date;

//luam doar partea de atribute din clasa careia vrem sa ii facem memento
public class MementoCaracterJoc {

	String denumire;
	int puncte;
	String abilitatiMagice;
	Date momentSalvare;
	
	public MementoCaracterJoc(String denumire, int puncte, String abilitatiMagice) {
		super();
		this.denumire = denumire;
		this.puncte = puncte;
		this.abilitatiMagice = abilitatiMagice;
		this.momentSalvare = new Date();
	}
	
	
}
