package ro.ase.csie.cts.seminar7.factory.factoryMethod;

import ro.ase.csie.cts.seminar7.factory.simpleFactory.SuperErouAbstract;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.TipErou;

public abstract class FactoryAbstract {

	public abstract SuperErouAbstract getSuperErou(TipErou tip,String nume);
}
