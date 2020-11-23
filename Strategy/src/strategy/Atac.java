package strategy;

public class Atac implements StrategieFotbal {
	
	int numarAtacanti;

	public Atac(int numarAtacanti) {
		this.numarAtacanti = numarAtacanti;
	}

	@Override
	public void schimbaPozitia() {
		System.out.println("Atacam cu " + this.numarAtacanti + " atacanti");
		
	};
	
	
}
