package state;

public class StareRezervat implements IStareLoc {

	@Override
	public void scaunLiber() {
		System.out.println("Scaunul este deja rezervat!");
		
	}

	@Override
	public void scaunRezervat() {
		System.out.println("Scaunul este deja rezervat!");
		
	}

	@Override
	public void scaunOcupat() {
		System.out.println("Scaunul este deja rezervat!");
		
	}

}
