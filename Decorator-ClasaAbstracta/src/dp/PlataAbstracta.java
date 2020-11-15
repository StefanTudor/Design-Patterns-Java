package dp;

public abstract class PlataAbstracta {
	
	double suma;
	String beneficiar;
	
	public PlataAbstracta(double suma, String beneficiar) {
		this.suma = suma;
		this.beneficiar = beneficiar;
	}

	public double getSuma() {
		return suma;
	}

	public String getBeneficiar() {
		return beneficiar;
	}

	public abstract void plataOnline();
	public abstract void plataNormala();
}
