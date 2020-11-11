package command;

import java.util.ArrayList;

public class Broker {
	
	private String name;
	private ArrayList<Comanda> comenzi;
	
	public Broker(String name) {
		this.name = name;
		comenzi = new ArrayList<>();
	}
	
	protected void addComanda(Comanda com) {
		this.comenzi.add(com);
		System.out.println("S-a adaugat comanda de " + com.getTip());
	}
	
	public void executaComenzi() {
		for(Comanda comanda : this.comenzi) {
			if(comanda.getTip().equals("vanzare"))
					System.out.println(this.name + " a procesat comanda domnului " 
							+ comanda.getNume() + " pentru vinderea a " + comanda.getNrActiuni() + " actiuni.");
			else
				System.out.println(this.name + " a procesat comanda domnului " 
						+ comanda.getNume() + " pentru cumpararea a " + comanda.getNrActiuni() + " actiuni.");
		}
	}

}
