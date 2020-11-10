package cts.tudor.stefan.g1085.adapter;

public class MedicamentFarmacie implements IMedFarmacie {

	protected String denumire;

	public MedicamentFarmacie(String denumire) {
		this.denumire = denumire;
	}

	@Override
	public void cumparaMedicament() {
		System.out.println("S-a cumparat: " + this.denumire);
	}
}
