package command;

public class Client {

	// Invoker

	public void plaseazaComandaVanzare(Comanda comanda) {
		comanda.vinde(comanda.getCodActiuni(), comanda.getNrActiuni());
	}
	
	public void plaseazaComandaCumpare(Comanda comanda) {
		comanda.cumpara(comanda.getCodActiuni(), comanda.getNrActiuni());
	}

}
