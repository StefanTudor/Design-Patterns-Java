package adapter;

public class Bitmap extends ImagineBitmap {
	
	int latime;
	int lungime;
	
	public Bitmap(int latime, int lungime) {
		super();
		this.latime = latime;
		this.lungime = lungime;
	}

	@Override
	public void redimensionare(int nouaLatime, int nouaLungime) {
		System.out.println("Redimensionare: " + nouaLatime + "x" + nouaLungime);
		
	}

	@Override
	public void modificaSchemaCulori(String schemaCulori) {
		System.out.println("Schema noua de culori: " + schemaCulori);
		
	}

	@Override
	public void afisareImagine() {
		System.out.println("S-a desenat imaginea!");
		
	}

}
