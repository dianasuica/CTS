package ro.ase.csie.cts.seminar11.observer;

public class TestObserver {

	public static void main(String[] args) {
		ModulConexiuneInternet modulConexiune = new ModulConexiuneInternet();
		
		ModulAutoSalvare modulSalvare = new ModulAutoSalvare();
		ModulNotificareJucator modulNotificari = new ModulNotificareJucator();
		
		modulConexiune.abonareModul(modulNotificari);
		modulConexiune.abonareModul(modulSalvare);
		modulConexiune.pierdereConexiune();
		
		modulConexiune.unregisterModul(modulSalvare);
		modulConexiune.pierdereConexiune();
	}
}
