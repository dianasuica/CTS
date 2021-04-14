package ro.ase.csie.cts.seminar8.facade;

public class Utilizator {

	public void login(String userName, String password) {
		System.out.println("login");
	}
	
	public ProfilJucator getProfil() {
		return new ProfilJucator();
	}
	
}
