package ro.ase.csie.cts.seminar11.memento;

public class TestMemento {

	public static void main(String[] args) {
		CaracterJoc superman = new CaracterJoc("superman", 1000, "Zboara");
		MementoCaracterJoc salvareInceputJoc = superman.salvare();
		superman.ataca();
		superman.seVindeca(100);
		System.out.println("Puncte viata: " + superman.puncte);
		
		superman.incarcaSalvare(salvareInceputJoc);
		System.out.println("Puncte viata: " + superman.puncte);
		
	}
}
