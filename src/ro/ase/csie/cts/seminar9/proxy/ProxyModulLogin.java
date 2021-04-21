package ro.ase.csie.cts.seminar9.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyModulLogin implements InterfataModulLogin{

	InterfataModulLogin modulLogin = null;
	//nu defineste si datele care se afla in modululLogin

	public static final int NR_MAX_INCERCARI = 3;
	public Map<String,Integer> incercari = new HashMap<>();
	
	public ProxyModulLogin(InterfataModulLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	@Override
	public boolean login(String username, String password) {
		Integer nrIncercariNereusite = incercari.get(username);
		
		//daca nu a mai incercat sa se conecteze pana acum il adaugam in hashmap
		if(nrIncercariNereusite == null) {
			incercari.put(username, 0);
			nrIncercariNereusite = 0;
		}
		
		if(modulLogin != null) {
			if(nrIncercariNereusite < 3) {
				if(modulLogin.login(username, password) == true) {
					nrIncercariNereusite = 0;
					incercari.put(username, nrIncercariNereusite);
					return true;
				}else {
					nrIncercariNereusite ++;
					incercari.put(username, nrIncercariNereusite);
					return false;
				}
			}else {
				return false;
			}
		}else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean verificaStatusServer() {
		if(modulLogin != null) {
			return modulLogin.verificaStatusServer();
		}else {
			throw new UnsupportedOperationException();
		}
	
	}
	
	
}
