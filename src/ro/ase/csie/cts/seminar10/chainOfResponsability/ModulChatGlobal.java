package ro.ase.csie.cts.seminar10.chainOfResponsability;

public class ModulChatGlobal extends HandlerChainAbstract{

	public ModulChatGlobal() {
		super("Modul Chat Global");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if(mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("At Everyone")) {
			System.out.println("Mesaj catre toti jucatorii: " + mesaj.getContinut());
		}
		
		if(this.next != null) {
			this.next.procesareMesajChat(mesaj);
		}
		
	}

	

}
