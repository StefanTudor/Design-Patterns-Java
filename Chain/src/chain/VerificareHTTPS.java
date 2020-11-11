package chain;

public class VerificareHTTPS extends VerificareAbstract {

	@Override
	public void verificaActiuneUser(TipActiune tip, String url) {
		if(tip == TipActiune.LINK) {
			if(url.indexOf("https") !=-1? true: false) {
				System.out.println("Link-ul " + url + " este securizat!");
			} else {
				System.out.println("Link-ul " + url + " nu este securizat!");

			}
		} else {
			System.out.println("Nu se poate face verificarea pentru URL-ul dat!");
		}
		if(this.next != null) {
			this.next.verificaActiuneUser(tip, url);
		}
		
	}

}
