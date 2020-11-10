package program;

import adapter.Bitmap;
import adapter.BitmapAdaptatLaPhotoImage;

public class Testare {
	public static void main(String[] args) {
		
		Bitmap bitmap = new Bitmap(1280, 720);
		bitmap.redimensionare(720, 480);
		
		BitmapAdaptatLaPhotoImage photoImage = new BitmapAdaptatLaPhotoImage(bitmap);
		photoImage.resize(100);
	}
}
