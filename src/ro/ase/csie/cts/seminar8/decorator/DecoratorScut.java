package ro.ase.csie.cts.seminar8.decorator;

import ro.ase.csie.cts.seminar8.adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter{
	
	int nivelScut;
	
	public DecoratorScut(ACMECaracterJoc caracter,int nivelScut) {
		super(caracter);
		this.nivelScut = nivelScut;
	}

	@Override
	public void esteLovit(int puncte) {
		//se scad mai putine puncte deoarece avem scut
		int puncteLovitura = puncte - this.nivelScut;
		if(puncteLovitura > 0) {
			super.caracter.esteLovit(puncteLovitura);
		}
	}
	
	
	

}
