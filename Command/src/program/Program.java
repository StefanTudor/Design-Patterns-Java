package program;

import command.Broker;
import command.Client;
import command.Comanda;

public class Program {
	
	public static void main(String[] args) {
		Client client = new Client();
		Broker broker = new Broker("Marcel");
		
		client.plaseazaComandaVanzare(new Comanda(broker, "Ion", 5, "abc"));
		client.plaseazaComandaCumpare(new Comanda(broker, "Mihai", 10, "abc"));
		
		broker.executaComenzi();

	}
	
	
}
