package program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

import memento.Bitmap;
import memento.MementoManager;

public class Program {

	public static void main(String[] args) {

		Bitmap bitmap = new Bitmap(300,300);
		bitmap.afisareImagine();
		bitmap.decupare(200, 200);
		
		MementoManager manager = new MementoManager();
		manager.addMemento(bitmap.creareMemento());
		bitmap.decupare(100, 100);
		bitmap.afisareImagine();
		
		
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			LocalDateTime now = LocalDateTime.now();
			bitmap.restoreMemento(manager.getMemento((dtf.format(now)).toString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		bitmap.afisareImagine();

	}

}
