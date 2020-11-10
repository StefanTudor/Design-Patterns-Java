package cts.tudor.stefan.g1085.adapter;

public class MedicamentSpital extends MedicamentSpitalAbstract {

	public MedicamentSpital(String numeMedicament, String reteta) {
		super(numeMedicament, reteta);
	}

	@Override
	public void achizitioneazaMedicament() {
		System.out.println("S-a achizitionat: " + this.numeMedicament);
		prezintaReteta();
	}

	@Override
	public void prezintaReteta() {
		System.out.println("Cu reteta: " + this.reteta);
	}
	
}
