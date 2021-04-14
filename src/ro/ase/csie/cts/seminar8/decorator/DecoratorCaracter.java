package ro.ase.csie.cts.seminar8.decorator;

import ro.ase.csie.cts.seminar8.adapter.ACMECaracterJoc;

public abstract class DecoratorCaracter extends ACMECaracterJoc{
	
	//caracterul care trebuie decorat
	ACMECaracterJoc caracter = null;

	public DecoratorCaracter(ACMECaracterJoc caracter) {
		super(caracter.getNume(),caracter.getPuncteViata());
		this.caracter = caracter;
	}

	//supradefinim aceste metode aici deoarece daca
	//un decorator nu supradefineste una din aceste metode
	//ea sa existe prin implementarea de aici
	@Override
	public void seDeplaseaza() {
		this.caracter.seDeplaseaza();
		
	}

	@Override
	public void esteLovit(int puncte) {
		this.caracter.esteLovit(puncte);
		
	}

	@Override
	public void seVindeca(int puncte) {
		this.caracter.seVindeca(puncte);
		
	}
	
	
	
	

}
