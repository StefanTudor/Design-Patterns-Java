package state;

public class Loc {

	private IStareLoc stareLoc;
	int nrLoc;

	public Loc(int nrLoc) {
		this.nrLoc = nrLoc;
		this.stareLoc = new StareLiber();
	}

	public void setStareLoc(IStareLoc stareLoc) {
		this.stareLoc = stareLoc;
	}
	
	public void ocupa() {
		stareLoc.scaunOcupat();
		this.setStareLoc(new StareOcupat());
	}
	
	public void elibereaza() {
		stareLoc.scaunLiber();
		this.setStareLoc(new StareLiber());
	}
	
	public void rezerva() {
		stareLoc.scaunRezervat();
		this.setStareLoc(new StareOcupat());
	}

}
