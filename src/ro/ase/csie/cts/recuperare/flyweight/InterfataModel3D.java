package ro.ase.csie.cts.recuperare.flyweight;

//interfata flyweight - modelul 3d este partea comuna
public interface InterfataModel3D {
	
	public void incarcaModel3D(String fisier);
	
	//metoda reuneste contextul cu modelul 3D
	public void afisareEcran(ContextEcran ecran);
	
	

}
