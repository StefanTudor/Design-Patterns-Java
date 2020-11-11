package chain;

public class ModulDescarcare extends VerificareAbstract {

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		if(tip == TipActiune.DOWNLOAD) {
			System.out.println("Fiser descarcat!");
		} else {
			System.out.println("Link accesat!");

		}
		
	}

}
