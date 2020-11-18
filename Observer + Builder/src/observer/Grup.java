package observer;

public class Grup extends Grupabil {
	String nume;

	public Grup(String nume) {
		super();
		this.nume = nume;
	}
	
	public void trimiteMeasj(String mesaj) {
		super.notificareGrup(" Grup " + this.nume + ": "+ mesaj);
	}
}
