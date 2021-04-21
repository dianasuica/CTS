package ro.ase.csie.cts.seminar9.state;

public class SuperErou {

	public static final int NIVEL_CRITIC = 10;
	
	String nume;
	int punctViata;
	
	InterfataMiscare modMiscare = null;
	
	//detaliu important la state!!
	//fie primim starea initiala, fie o punem noi default
    //metoda set nu ar trebui sa apara
	//la masina cu stari se schimba singura starea in functii
	
	public SuperErou(String nume, int punctViata) {
		super();
		this.nume = nume;
		this.punctViata = punctViata;
		this.modMiscare = new MiscareNormala();
	}
	
    void seDeplaseaza() {
		this.modMiscare.seDeplaseaza();
	}
    
    void esteAtacat(int puncte) {
    	this.punctViata -= puncte;
    	if(this.punctViata < NIVEL_CRITIC) {
    		this.modMiscare = new MiscareModRanit();
    	}
    }
    
    void seVindeca(int puncte) {
    	this.punctViata += puncte;
    	if(this.punctViata >= NIVEL_CRITIC) {
    		this.modMiscare = new MiscareNormala();
    	}
    }
}
