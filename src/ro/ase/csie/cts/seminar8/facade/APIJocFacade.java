package ro.ase.csie.cts.seminar8.facade;

public class APIJocFacade {
	
	//metodele nu sunt statice daca aceasta clasa contine si date specifice fiecarei instantieri
	
	//daca nu stocam date aici si nu instantiem aceasta clasa, folosim metode statice
	
	public static ProfilJucator getProfil(String ip, int port, String userName, String password) {
		ServerJoc server = new ServerJoc(ip, port);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login(userName, password);
			ProfilJucator profil = utilizator.getProfil();
			return profil;
		}else {
			return null;
		}
	}

}
