package cts.tudor.stefan.g1085.decorator;

public abstract class ModulVerificareAbstract implements IAntivirus {
	
	IAntivirus obiectDecorat = null;

	public ModulVerificareAbstract(IAntivirus obiectDecorat) {
		this.obiectDecorat = obiectDecorat;
	}

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		this.obiectDecorat.verificaActiuneUser(tip, url);
		System.out.println("Se verifica inca ceva...");
	}
}
