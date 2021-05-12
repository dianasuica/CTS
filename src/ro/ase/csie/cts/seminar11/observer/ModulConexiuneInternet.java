package ro.ase.csie.cts.seminar11.observer;

import java.util.ArrayList;

public class ModulConexiuneInternet{

	ArrayList<InterfataStatusConexiune> module = new ArrayList<>();
	
	public void abonareModul(InterfataStatusConexiune modul) {
		module.add(modul);
	}
	
	public void unregisterModul(InterfataStatusConexiune modul) {
		module.remove(modul);
	}
	
	public void pierdereConexiune() {
		for(InterfataStatusConexiune modul : module) {
			modul.notificarePierdereConexiune();
		}
	}
}
