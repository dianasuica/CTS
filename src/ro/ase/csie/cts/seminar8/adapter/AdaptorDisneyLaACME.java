package ro.ase.csie.cts.seminar8.adapter;

//extindem modulul vechi
public class AdaptorDisneyLaACME extends ACMECaracterJoc{

	//referinta la modulul nou
	ActiuniDisney caracterDisney = null;

	public AdaptorDisneyLaACME(ActiuniDisney caracterDisney) {
		super(caracterDisney.getNume(),caracterDisney.getPower());
		this.caracterDisney = caracterDisney;
	}

	@Override
	public void seDeplaseaza() {
		caracterDisney.move(0, 0);
		
	}

	@Override
	public void esteLovit(int puncte) {
		caracterDisney.primesteLovitura(puncte);
		
	}

	@Override
	public void seVindeca(int puncte) {
		caracterDisney.reincarca(puncte);
		
	}
	
	
}
