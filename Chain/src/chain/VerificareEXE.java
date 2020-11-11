package chain;

public class VerificareEXE extends VerificareAbstract {

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		if(tip == TipActiune.DOWNLOAD) {
			if(url.length() % 2 == 0) {
				System.out.println("Fisierul " + url + " contine virusi!");
				System.out.println("Verificare oprita");
				super.setNext(null);
			} else {
				System.out.println("Fisierul " + url + " nu contine virusi!");

			}
		} else {
			System.out.println("Nu se poate face verificarea pentru URL-ul dat!");
		}
		if(this.next != null) {
			this.next.verificaActiuneUser(tip, url);
		}
	}

}
