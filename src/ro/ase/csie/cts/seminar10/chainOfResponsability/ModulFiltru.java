package ro.ase.csie.cts.seminar10.chainOfResponsability;

public class ModulFiltru extends HandlerChainAbstract{

	public ModulFiltru(String numeModul) {
		super(numeModul);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		String[] dictionarNepermis = new String[] {"rau","obraznic","violent"};
		boolean esteValid = true;
		
		for(String cuvant : dictionarNepermis) {
			if(mesaj.getContinut().contains(cuvant)) {
				esteValid = false;
				break;
			}
		}
		
		if(esteValid && this.next != null) {
			this.next.procesareMesajChat(mesaj);
		}
	}



}
