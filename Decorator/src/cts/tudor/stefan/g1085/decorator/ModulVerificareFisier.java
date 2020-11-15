package cts.tudor.stefan.g1085.decorator;

public class ModulVerificareFisier implements IAntivirus {
	
	String denumire;
	String cod;

	public ModulVerificareFisier(String denumire, String cod) {
		super();
		this.denumire = denumire;
		this.cod = cod;
	}


	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		System.out.println("Verificare " + tip + " fisier " + url + " in modulul " + this.denumire);
	}
	
	

}
