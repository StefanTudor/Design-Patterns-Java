package cts.tudor.stefan.g1085.adapter;

public abstract class MedicamentSpitalAbstract {
	
	protected String numeMedicament;
	protected String reteta;
	
	public MedicamentSpitalAbstract(String numeMedicament, String reteta) {
		this.numeMedicament = numeMedicament;
		this.reteta = reteta;
	}

	public String getNumeMedicament() {
		return numeMedicament;
	}

	public String getReteta() {
		return reteta;
	}
	
	public abstract void achizitioneazaMedicament();
	public abstract void prezintaReteta();
	
}
