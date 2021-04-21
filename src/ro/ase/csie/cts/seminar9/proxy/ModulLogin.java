package ro.ase.csie.cts.seminar9.proxy;

public class ModulLogin implements InterfataModulLogin{

	String ipServer;
	int port;
	
	public ModulLogin(String string, int i) {
		this.ipServer = string;
		this.port = i;
	}

	@Override
	public boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("admin")) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean verificaStatusServer() {
		return true;
	}
	
	

}
