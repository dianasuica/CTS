package ro.ase.csie.cts.recuperare.flyweight;

//pt a gestiona starea temporara
public class ContextEcran {
	
	int x;
	int y;
	String culoareTextura;
	
	
	public ContextEcran(int x, int y, String culoareTextura) {
		super();
		this.x = x;
		this.y = y;
		this.culoareTextura = culoareTextura;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getCuloareTextura() {
		return culoareTextura;
	}


	public void setCuloareTextura(String culoareTextura) {
		this.culoareTextura = culoareTextura;
	}
	
	

}
