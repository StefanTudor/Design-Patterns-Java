package dp;

public class Plata implements Payable {
	double suma;
	String beneficiar;
	
	public Plata(double suma, String beneficiar) {
		super();
		this.suma = suma;
		this.beneficiar = beneficiar;
	}

	public double getSuma() {
		return suma;
	}

	public String getBeneficiar() {
		return beneficiar;
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
