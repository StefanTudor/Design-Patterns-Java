package memento;

public abstract class ImagineBitmap {
	protected int latime;
	protected int lungime;
	protected String schemaCulori;
	protected String codCuloare;
	
	public abstract void redimensionare(int nouaLatime, int nouaLungime);
	public abstract void modificaSchemaCulori(String schemaCulori);
	public abstract void decupare(int nouaLatime, int nouaLungime);
	public abstract void efectCuloare(String codCuloare);
	
	public abstract void afisareImagine();
}
