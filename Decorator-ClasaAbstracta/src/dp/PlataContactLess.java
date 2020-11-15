package dp;

public class PlataContactLess extends DecoratorPlataAbstract {

	public PlataContactLess(PlataAbstracta plata) {
		super(plata);
	} 

	public void plataContactLess() {
		System.out.println("S-a efectuat plata contactless de " + this.plata.getSuma() 
		+ " catre " + this.plata.getBeneficiar());
	}
	

}
