package ro.ase.csie.cts.recuperare.composite;

public abstract class NodAbstractStructura implements InterfataCaractereNPC{
	
	public abstract void adaugaNod(NodAbstractStructura nod);
	public abstract void stergeNod(NodAbstractStructura nod);
	public abstract NodAbstractStructura getNod(int index);

	
}
