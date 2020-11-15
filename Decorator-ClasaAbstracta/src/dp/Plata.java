package dp;

public class Plata extends PlataAbstracta {

	public Plata(double suma, String beneficiar) {
		super(suma, beneficiar);
	}

	@Override
	public void plataOnline() {
		System.out.println("S-a efectuat plata online de " + this.suma + " catre " + this.beneficiar);
	}

	@Override
	public void plataNormala() {
		System.out.println("S-a efectuat plata la casa de " + this.suma + " catre " + this.beneficiar);
	}
	
}
