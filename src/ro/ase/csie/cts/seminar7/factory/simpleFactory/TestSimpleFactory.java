package ro.ase.csie.cts.seminar7.factory.simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		//fara simple factory
		SuperErouAbstract supererou = new CaracterDisney("Mickey",3,false);
	    supererou = new CaracterMarvel("Spinderman", 150, 50);
        supererou = new CaracterDC("Batman", 150);
        
        //cu simple factory
        SuperErouAbstract superCaracter = FactorySuperErou.getSuperErou(TipErou.DISNEY,"Minnie");
        superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL,"SpiderMan");
        superCaracter = FactorySuperErou.getSuperErou(TipErou.DC,"Batman");
	}

}
