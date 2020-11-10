package cts.tudor.stefan.g1085.adapter;

public class AdapterSpital2Farmacie implements IMedFarmacie {
	
	MedicamentSpitalAbstract medSpital;

	public AdapterSpital2Farmacie(MedicamentSpitalAbstract medSpital) {
		super();
		this.medSpital = medSpital;
	}

	@Override
	public void cumparaMedicament() {
		System.out.println("S-a cumparat: " + medSpital.getNumeMedicament());
	}	

}
