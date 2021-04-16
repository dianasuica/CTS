package ro.ase.csie.cts.recuperare.composite;

public class TestComposite {
	
	public static void main(String[] args) {
		
		GrupCaractere grup1 = new GrupCaractere("Grup1");
		grup1.adaugaNod(new CaractereNPC("Soldat1", 100));
		grup1.adaugaNod(new CaractereNPC("Soldat2", 100));
		
		GrupCaractere grup2 = new GrupCaractere("Grup2");
		grup1.adaugaNod(new CaractereNPC("Soldat3", 200));
		grup1.adaugaNod(new CaractereNPC("Tanc", 500));
		
		
		GrupCaractere grupNivelJoc = new GrupCaractere("Level 2");
		grupNivelJoc.adaugaNod(new CaractereNPC("Level BOSS", 1000));
		grupNivelJoc.adaugaNod(grup1);
		grupNivelJoc.adaugaNod(grup2);
		
		grupNivelJoc.atacaJucator("Superman");
		grupNivelJoc.seRetrage();
		grupNivelJoc.getNod(0).seDeplaseaza(); // luam bossul si il punem sa se deplaseze
	}

}
