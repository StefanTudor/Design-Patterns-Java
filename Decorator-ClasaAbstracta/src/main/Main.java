package main;

import dp.DecoratorPlataAbstract;
import dp.Plata;
import dp.PlataContactLess;

public class Main {

	public static void main(String[] args) {
		
		Plata plata = new Plata(300, "Ionut");
		
		plata.plataOnline();
		plata.plataNormala();
		
		DecoratorPlataAbstract plataContactless = new PlataContactLess(plata);
		((PlataContactLess) plataContactless).plataContactLess();
		
	}

}
