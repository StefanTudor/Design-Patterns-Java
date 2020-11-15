package cts.tudor.stefan.g1085.composite;

import java.util.ArrayList;

public class GrupEmail implements NodAbstractStructura {
	
	String denumire;
	ArrayList<NodAbstractStructura> noduri = 
			new ArrayList<>();

	public GrupEmail(String nume) {
		this.denumire = nume;
	}

	@Override
	public void arhivare(Email email) {
		for (NodAbstractStructura nod : noduri) {
			nod.arhivare(email);
		}
	}

	@Override
	public void citeste(Email email) {
		for (NodAbstractStructura nod : noduri) {
			nod.citeste(email);
		}
	}

	@Override
	public void adaugaClient(NodAbstractStructura client) {
		this.noduri.add(client);
	}

	@Override
	public void stergeClient(int index) {
		if(index < this.noduri.size())
			this.noduri.remove(index);		
	}

	@Override
	public NodAbstractStructura getClient(int index) {
		if(index < this.noduri.size())
			return this.noduri.get(index);
		else
			return null;
	}
	
	

}
