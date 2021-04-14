package ro.ase.csie.cts.seminar8.decorator;

import ro.ase.csie.cts.seminar8.adapter.ACMECaracterJoc;
import ro.ase.csie.cts.seminar8.adapter.CaracterFantastic;

public class TestDecorator {

	public static void main(String[] args) {
		ACMECaracterJoc dragon = new CaracterFantastic("Dragonas", 1000);
		dragon.seDeplaseaza();
		dragon.esteLovit(200);
		dragon.seVindeca(100);
		
		//decoram dragonul cu scut
		dragon = new DecoratorScut(dragon,200);
		dragon.esteLovit(300); //acum la lovitura nu se vor scadea toate punctele deoarece are scut
		
		dragon = new DecoratorRanit(dragon);
		dragon.esteLovit(500); //dragonul inca are scutul, chiar daca i-am adaugat si decoratorul ranit

	}

}
