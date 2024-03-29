package ro.ase.csie.cts.seminar8.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {
		
		//fara adapter
		CaracterFantastic dragon = new CaracterFantastic("Dragonas", 1000);
		dragon.seDeplaseaza();
		dragon.esteLovit(200);
		dragon.seVindeca(100);
		
		DonaldDuck donald = new DonaldDuck();
		donald.setPower(500);
		donald.move(100, 100);
		donald.primesteLovitura(50);
		donald.reincarca(50);
		
		//cu adapter
		//unul dintre ele trebuie adaptat in functie de celalalt
		//trebuie sa il integram pe Donald la modulul catacterelor fantastice
		
		ArrayList<ACMECaracterJoc> caractere = new ArrayList<>();
		caractere.add(dragon);
		
		//vrem sa introducem caracterul disney in lista acme => avem nevoie de adapter
		AdaptorDisneyLaACME adaptorDonald = new AdaptorDisneyLaACME(donald);
		caractere.add(adaptorDonald);
		
		System.out.println("----------------ADAPTOR----------------");
		for( ACMECaracterJoc caracter : caractere ) {
			caracter.seDeplaseaza();
			caracter.esteLovit(50);
		}
	}

}
