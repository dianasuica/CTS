package ro.ase.csie.cts.seminar7.factory.factoryMethod;

import ro.ase.csie.cts.seminar7.factory.simpleFactory.CaracterDC;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.CaracterDisney;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.CaracterMarvel;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.SuperErouAbstract;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.TipErou;

public class FactoryTemaUniversala extends FactoryAbstract {

	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
        SuperErouAbstract superErou = null;
		switch(tip) {
		case DISNEY:
			superErou = new CaracterDisney(nume,100, false);
			break;
		case MARVEL:
			superErou = new CaracterMarvel(nume, 500, 0);
			break;
		case DC:
			superErou = new CaracterDC(nume, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return superErou;
	}

}
