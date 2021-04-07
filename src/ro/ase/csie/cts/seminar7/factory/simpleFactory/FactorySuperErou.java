package ro.ase.csie.cts.seminar7.factory.simpleFactory;

public class FactorySuperErou {

	//trebuie sa cerem un detaliu ca sa ne dam seama ce tip de erou se doreste
	//a fi creat
	public static SuperErouAbstract getSuperErou(TipErou tip, String nume) {
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
