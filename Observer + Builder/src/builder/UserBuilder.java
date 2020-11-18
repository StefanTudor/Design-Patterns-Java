package builder;

public class UserBuilder {
	
	private Utilizator utilizator;

	public UserBuilder(String nume, String prenume, TipCont tip) {
		this.utilizator = new Utilizator(null,null,null,0,null,null,null,null);
		this.utilizator.setNume(nume);
		this.utilizator.setPrenume(prenume);
		this.utilizator.setTip(tip);
	}
	
	public UserBuilder setVarsta(int varsta) {
		this.utilizator.setVarsta(varsta);
		return this;
	}

	public UserBuilder setGen(String gen) {
		this.utilizator.setGen(gen);
		return this;
	}

	public UserBuilder setGrupa(String grupa) {
		this.utilizator.setGrupa(grupa);
		return this;
	}

	public UserBuilder setFacultatea(String facultatea) {
		this.utilizator.setFacultatea(facultatea);
		return this;
	}

	public UserBuilder setCursCoordonat(String cursCoordonat) {
		this.utilizator.setCursCoordonat(cursCoordonat);
		return this;
	}
	
	public Utilizator build() {
		return this.utilizator;
	}

}
