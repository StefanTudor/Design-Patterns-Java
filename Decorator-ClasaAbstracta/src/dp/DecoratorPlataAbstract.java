package dp;

public abstract class DecoratorPlataAbstract extends PlataAbstracta {
	
	protected PlataAbstracta plata = null;

	public DecoratorPlataAbstract(PlataAbstracta plata) {
		super(0, "");
		this.plata = plata;
	}

	@Override
	public void plataOnline() {
		this.plata.plataOnline();
	}

	@Override
	public void plataNormala() {
		this.plata.plataNormala();
	}
}
