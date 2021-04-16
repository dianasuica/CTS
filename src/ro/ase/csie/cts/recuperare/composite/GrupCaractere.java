package ro.ase.csie.cts.recuperare.composite;

import java.util.ArrayList;

public class GrupCaractere extends NodAbstractStructura{

	ArrayList<NodAbstractStructura> noduri = new ArrayList<>();
	String denumire;
	
	public GrupCaractere( String denumire) {
		super();
		this.denumire = denumire;
	}

	//tot grupul de noduri va ataca jucatorul
	@Override
	public void atacaJucator(String numeJucator) {
		for(NodAbstractStructura nod : noduri) {
			nod.atacaJucator(numeJucator);
		}
		
	}

	//tot grupul se va retrage
	@Override
	public void seRetrage() {
		for(NodAbstractStructura nod : noduri) {
			nod.seRetrage();
		}
		
	}

	//grupul nu se poate deplasa - depinde de contextul cerintei daca
	//se pot implementa unele functii in grup sau nu
	@Override
	public void seDeplaseaza() {
		throw new UnsupportedOperationException();
		
		
	}

	@Override
	public void adaugaNod(NodAbstractStructura nod) {
		this.noduri.add(nod);
		
	}

	@Override
	public void stergeNod(NodAbstractStructura nod) {
		this.noduri.remove(nod);
		
	}

	@Override
	public NodAbstractStructura getNod(int index) {
		return this.noduri.get(index);
	}

}
