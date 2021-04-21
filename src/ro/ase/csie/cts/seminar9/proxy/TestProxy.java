package ro.ase.csie.cts.seminar9.proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		InterfataModulLogin login = new ModulLogin("10.0.0.1",127);
		if(login.login("admin", "admin")) {
			System.out.println("Hello admin");
		}
		
		String[] parole = new String[]{"1234","123456","admin12","admin"};
		
		//cu proxy
		login = new ProxyModulLogin(login);
		for(String parola: parole) {
			if(login.login("admin", parola)) {
				System.out.println("Parola gasita: " + parola);
			}
		}
		System.out.println("logout");
	}

}
