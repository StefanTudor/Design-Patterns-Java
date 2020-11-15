package cts.tudor.stefan.g1085.main;

import cts.tudor.stefan.g1085.composite.ClientEmail;
import cts.tudor.stefan.g1085.composite.Email;
import cts.tudor.stefan.g1085.composite.GrupEmail;

public class Main {

	public static void main(String[] args) {
		
		ClientEmail client1 = new ClientEmail("Ionut", 1, false);
		ClientEmail client2 = new ClientEmail("Dan", 45, true);
		ClientEmail client3 = new ClientEmail("Cristi", 28, true);

		
		client1.citeste(new Email("tudor.stefan", "Intrebare", "Am o intrbare"));
		
		GrupEmail grup1 = new GrupEmail("Grupul 1");
		grup1.adaugaClient(client1);
		grup1.adaugaClient(client2);
		grup1.adaugaClient(client3);
		grup1.citeste(new Email("tudor.stefan", "Intrebare", "Am o intrbare"));
		
	}

}
