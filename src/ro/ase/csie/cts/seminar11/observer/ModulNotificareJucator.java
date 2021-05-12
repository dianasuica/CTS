package ro.ase.csie.cts.seminar11.observer;

public class ModulNotificareJucator implements InterfataStatusConexiune{

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Pop UP! Conexiune internet pierduta");
		
	}

}
