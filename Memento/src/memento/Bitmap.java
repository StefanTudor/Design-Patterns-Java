package memento;

public class Bitmap extends ImagineBitmap {

	public Bitmap(int latime, int lungime) {
		super.latime = latime;
		super.lungime = lungime;
	}

	@Override
	public void redimensionare(int nouaLatime, int nouaLungime) {
		System.out.println("Redimensionare: " + nouaLatime + " x " + nouaLungime);
		super.latime = nouaLatime;
		super.lungime = nouaLungime;

	}

	@Override
	public void modificaSchemaCulori(String schemaCulori) {
		System.out.println("Schema culori: " + schemaCulori);

	}

	@Override
	public void decupare(int nouaLatime, int nouaLungime) {
		System.out.println("Decupare: " + nouaLatime + " x " + nouaLungime);
		super.latime = nouaLatime;
		super.lungime = nouaLungime;
	}

	@Override
	public void efectCuloare(String codCuloare) {
		System.out.println("Efect culoare: " + codCuloare);

	}

	@Override
	public void afisareImagine() {
		System.out.println("Imaginea este afisata! Dimensiuni: " + super.latime + " x " + super.lungime);

	}

	public Memento creareMemento() {
		return new Memento(this);
	}

	public void restoreMemento(Memento mem) {
		super.latime = mem.getLatime();
		super.lungime = mem.getLungime();
	}

}
