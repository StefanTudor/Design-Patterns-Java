package dp;

public abstract class DecoratorPlataAbstract implements Payable {
	
	Payable plata = null;

	public DecoratorPlataAbstract(Payable plata) {
		super();
		this.plata = plata;
	}

	@Override
	public void plataNormala() {
		this.plata.plataNormala();
		
	}

	@Override
	public void plataOnline() {
		this.plata.plataOnline();
		
	}

}
