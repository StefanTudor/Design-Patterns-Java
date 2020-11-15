package cts.tudor.stefan.g1085.composite;

public class ClientEmail implements NodAbstractStructura {
	
	String nume;
	int rank;
	boolean isPremium;

	public ClientEmail(String nume, int rank, boolean isPremium) {
		this.nume = nume;
		this.rank = rank;
		this.isPremium = isPremium;
	}

	@Override
	public void arhivare(Email email) {
		System.out.println("Arhivare email " + email.getTitlu());
	}

	@Override
	public void citeste(Email email) {
		System.out.println(this.nume + " are un email de la " + email.getExpeditor() + ": "+ email.getTitlu());
		
	}

	@Override
	public void adaugaClient(NodAbstractStructura client) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void stergeClient(int index) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public NodAbstractStructura getClient(int index) {
		throw new UnsupportedOperationException();
	}
	
	
}
