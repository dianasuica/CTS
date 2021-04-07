package ro.ase.csie.cts.seminar7.factory.factoryMethod;

import ro.ase.csie.cts.seminar7.factory.simpleFactory.CaracterDC;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.CaracterDisney;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.CaracterMarvel;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.SuperErouAbstract;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.TipErou;

public class FactoryTemaProprie extends FactoryAbstract{

	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		SuperErouAbstract superErou = null;
		switch(tip) {
		case DISNEY:
			superErou = new CaracterPropriuDisney(nume,100);
			break;
		case MARVEL:
			superErou = new CaracterPropriuMarvel(nume, 500);
			break;
		case DC:
			superErou = new CaracterPropriuDC(nume, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return superErou;
	}

}
