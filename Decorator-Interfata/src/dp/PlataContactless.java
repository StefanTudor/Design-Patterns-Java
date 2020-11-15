package dp;

public class PlataContactless extends DecoratorPlataAbstract {

	public PlataContactless(Payable plata) {
		super(plata);
	}
	
	public void plataContactless() {
		System.out.println("S-a efectuat plata online de " + ((Plata)plata).getSuma() + 
				" catre " + ((Plata)plata).getBeneficiar());
	}

}
