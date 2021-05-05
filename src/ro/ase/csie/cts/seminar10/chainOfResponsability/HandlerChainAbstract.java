package ro.ase.csie.cts.seminar10.chainOfResponsability;

public abstract class HandlerChainAbstract {

	HandlerChainAbstract next = null;

	//putem defini si alte atribute de care am avea nevoie
	String numeModul;
	
	public HandlerChainAbstract(String numeModul) {
		super();
		this.numeModul = numeModul;
	}

	public void setNext(HandlerChainAbstract next) {
		this.next = next;
	}
	
	public abstract void procesareMesajChat(MesajChat mesaj);

}
