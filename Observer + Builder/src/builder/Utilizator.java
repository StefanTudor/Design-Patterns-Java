package builder;

public class Utilizator {
	
	private String nume;
	private String prenume;
	private TipCont tip;
	private int varsta;
	private String gen;
	private String grupa;
	private String facultatea;
	private String cursCoordonat;
	
	protected Utilizator(String nume, String prenume, TipCont tip, int varsta, String gen, String grupa,
			String facultatea, String cursCoordonat) {
		this.nume = nume;
		this.prenume = prenume;
		this.tip = tip;
		this.varsta = varsta;
		this.gen = gen;
		this.grupa = grupa;
		this.facultatea = facultatea;
		this.cursCoordonat = cursCoordonat;
	}
	
	protected Utilizator() {
		
	}

	protected void setNume(String nume) {
		this.nume = nume;
	}

	protected void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	protected void setTip(TipCont tip) {
		this.tip = tip;
	}

	protected void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	protected void setGen(String gen) {
		this.gen = gen;
	}

	protected void setGrupa(String grupa) {
		this.grupa = grupa;
	}

	protected void setFacultatea(String facultatea) {
		this.facultatea = facultatea;
	}

	protected void setCursCoordonat(String cursCoordonat) {
		this.cursCoordonat = cursCoordonat;
	}

	@Override
	public String toString() {
		return "User [nume=" + nume + ", prenume=" + prenume + ", tip=" + tip + ", varsta=" + varsta + ", gen=" + gen
				+ ", grupa=" + grupa + ", facultatea=" + facultatea + ", cursCoordonat=" + cursCoordonat + "]";
	}
	
	

}
