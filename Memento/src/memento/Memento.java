package memento;

import java.io.Console;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memento {
	
	private int latime;
	private int lungime;
	private String data;
	
	public Memento(Bitmap bitmap) {
		this.latime = bitmap.latime;
		this.lungime = bitmap.lungime;
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime now = LocalDateTime.now();
		this.data = dtf.format(now);
	}

	public int getLatime() {
		return latime;
	}

	public int getLungime() {
		return lungime;
	}

	public String getData() {
		return data;
	}

}
