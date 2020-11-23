package state;

public class StareOcupat implements IStareLoc {

	@Override
	public void scaunLiber() {
		System.out.println("Scaunul a fost eliberat!");
		
	}

	@Override
	public void scaunRezervat() {
		System.out.println("Scaunul este deja ocupat!");
		
	}

	@Override
	public void scaunOcupat() {
		System.out.println("Scaunul este deja ocupat!");
		
	}

}
