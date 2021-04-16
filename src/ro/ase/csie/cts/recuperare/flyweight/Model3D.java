package ro.ase.csie.cts.recuperare.flyweight;

import java.util.ArrayList;

//FLYWEIGHT
public class Model3D implements InterfataModel3D{
	
	//datele modelului 3D
	String descriere;
	ArrayList<Integer> puncteModel = new ArrayList<>();

	public Model3D(String model) {
		this.descriere = model;
	}

	@Override
	public void incarcaModel3D(String fisier) {
		System.out.println(String.format("Incarcare model pentru %s din fisierul %s", descriere,fisier));
		for(int i=0;i<10;i++) {
			puncteModel.add(i);
		}
		
	}

	@Override
	public void afisareEcran(ContextEcran context) {
		System.out.println(String.format("Afisare %s la %d, %d cu textura %s", 
				descriere,context.getX(),context.getY(),context.getCuloareTextura()));
		
	}

}
