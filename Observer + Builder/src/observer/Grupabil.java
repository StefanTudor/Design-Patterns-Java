package observer;

import java.util.ArrayList;

public abstract class Grupabil {
	private ArrayList<ITransmitereMesaj> abonati = new ArrayList<>();
	
	public void abonare(ITransmitereMesaj observer) {
		if(this.abonati != null) {
			this.abonati.add(observer);
		}
	}
	
	public void dezabonare(ITransmitereMesaj observer) {
		if(this.abonati != null) {
			this.abonati.remove(observer);
		}
	}
	
	public void notificareGrup(String mesaj) {
		if(this.abonati != null) {
			for(ITransmitereMesaj observer : abonati) {
				observer.primireMesaj(((User)observer).getNume(), mesaj);
			}
		}
	}
	
}
