package adapter;

public class BitmapAdaptatLaPhotoImage extends PhotoImage {
	
	private Bitmap obiectAdaptat = null;

	public BitmapAdaptatLaPhotoImage(Bitmap obiectAdaptat) {
		this.obiectAdaptat = obiectAdaptat;
	}

	@Override
	public void resize(float procentResize) {
		this.obiectAdaptat.redimensionare((int)procentResize, (int)procentResize);
		
	}

	@Override
	public void aplicaFiltruCuloare(String culoare) {
		this.obiectAdaptat.modificaSchemaCulori(culoare);
		
	}

}
