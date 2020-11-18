package program;

import builder.TipCont;
import builder.UserBuilder;
import builder.Utilizator;
import observer.Grup;
import observer.User;

public class Main {
	public static void main(String[] args) {
		
		//observer
		
		Grup grup = new Grup("1085");
		User u1 = new User("User One");
		User u2 = new User("User Two");
		User u3 = new User("User Three");

		grup.abonare(u1);
		grup.abonare(u2);
		grup.abonare(u3);
		
		grup.trimiteMeasj("Ati facut tema?");
		
		grup.dezabonare(u3);
		
		grup.trimiteMeasj("Ce tema?");
		
		//builder
		
		Utilizator utilizator = new UserBuilder("Tudor", "Stefan", TipCont.STUDENT)
				.setGrupa("1085").build();
		System.out.println(utilizator.toString());
	}
}
