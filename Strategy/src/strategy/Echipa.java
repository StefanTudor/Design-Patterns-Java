package strategy;

public class Echipa {
	
	private String denumire;
	private StrategieFotbal strategie;
	
	public Echipa(String denumire) {
		super();
		this.denumire = denumire;
		this.strategie = new JocNormal();
	}

	public void setStrategie(StrategieFotbal strategie) {
		this.strategie = strategie;
	}
	
	public void joaca() {
		if(this.strategie != null) {
			strategie.schimbaPozitia();
		} else {
			throw new UnsupportedOperationException();
		}
	}

}
