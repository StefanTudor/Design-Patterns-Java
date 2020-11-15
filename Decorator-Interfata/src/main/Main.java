package main;

import dp.DecoratorPlataAbstract;
import dp.Plata;
import dp.PlataContactless;

public class Main {

	public static void main(String[] args) {
		
		Plata plata = new Plata(300, "Ionut");
		
		plata.plataOnline();
		plata.plataNormala();
		
		DecoratorPlataAbstract plataContactless = new PlataContactless(plata);
		((PlataContactless) plataContactless).plataContactless();
		
	}

}
