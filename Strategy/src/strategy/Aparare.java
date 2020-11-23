package strategy;

public class Aparare implements StrategieFotbal {
	
	int numarAparatori;

	public Aparare(int numarAparatori) {
		this.numarAparatori = numarAparatori;
	}

	@Override
	public void schimbaPozitia() {
		System.out.println("Ne aparam cu " + this.numarAparatori + " aparatori");
		
	};
	
	
}
