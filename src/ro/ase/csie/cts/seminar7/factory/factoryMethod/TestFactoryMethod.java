package ro.ase.csie.cts.seminar7.factory.factoryMethod;

import ro.ase.csie.cts.seminar7.factory.simpleFactory.SuperErouAbstract;
import ro.ase.csie.cts.seminar7.factory.simpleFactory.TipErou;

public class TestFactoryMethod {

	public static void main(String[] args) {
		boolean esteTemaProprie = true;
		
		FactoryAbstract factoryCaractere = null;
		
		if(esteTemaProprie) {
			factoryCaractere = new FactoryTemaProprie();
		}else {
			factoryCaractere = new FactoryTemaUniversala();
		}
		
		SuperErouAbstract superCaracter = factoryCaractere.getSuperErou(TipErou.DC, "Batman"); 

	}

}
