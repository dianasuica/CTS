package ro.ase.csie.cts.seminar10.chainOfResponsability;

public class TestChain {

	public static void main(String[] args) {
	
		HandlerChainAbstract chatGlobal = new ModulChatGlobal();
		HandlerChainAbstract chatPrivat = new ModulChatPrivat();
		HandlerChainAbstract filtruChat = new ModulFiltru("Reguli limba romana");
		
		//root - filtruChat
		filtruChat.setNext(chatPrivat);
		chatPrivat.setNext(chatGlobal);
		
		filtruChat.procesareMesajChat(new MesajChat("At Everyone", "Esti rau", 1));
		filtruChat.procesareMesajChat(new MesajChat("At Everyone", "Esti ok", 1));
		filtruChat.procesareMesajChat(new MesajChat("Gigel", "Hai sa incercam nivelul 5", 1));


	}

}
