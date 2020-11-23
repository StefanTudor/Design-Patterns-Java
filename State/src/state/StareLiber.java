package state;

public class StareLiber implements IStareLoc {

	@Override
	public void scaunLiber() {
		System.out.println("Scaunul este deja liber!");
		
	}

	@Override
	public void scaunRezervat() {
		System.out.println("Scaunul a fost rezervat!");
		
	}

	@Override
	public void scaunOcupat() {
		System.out.println("Scaunul a fost ocupat!");
		
	}

}
