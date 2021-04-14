package ro.ase.csie.cts.seminar8.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		//fara facade - clientul trebuie sa respecte aceasta ordine a operatiilor
		ServerJoc server = new ServerJoc("10.0.0.1", 3306);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login("player1", "1234");
			ProfilJucator profil = utilizator.getProfil();
			String dateProfil = profil.getDateProfil();
		}
		
		//cu facade
		ProfilJucator profil2 = APIJocFacade.getProfil("10.0.0.1", 3306, "player2", "5678");
		String dateProfil = profil2.getDateProfil();

	}

}
