package cts.tudor.stefan.g1085.decorator;

public class ModulVerificareCompleta extends ModulVerificareAbstract {

	public ModulVerificareCompleta(IAntivirus obiectDecorat) {
		super(obiectDecorat);
	}
	
	public void verificareDimensiuneFisier(TipActiune tip, String url) {
		System.out.println("Verificare " + tip + " fisier " + url 
				+ " dimensiune: " + url.length() + "kb.");
	}

}
