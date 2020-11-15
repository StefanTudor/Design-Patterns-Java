package cts.tudor.stefan.g1085.main;

import cts.tudor.stefan.g1085.decorator.ModulVerificareAbstract;
import cts.tudor.stefan.g1085.decorator.ModulVerificareCompleta;
import cts.tudor.stefan.g1085.decorator.ModulVerificareFisier;
import cts.tudor.stefan.g1085.decorator.TipActiune;

public class Testare {

	public static void main(String[] args) {
		
		ModulVerificareFisier modul = new ModulVerificareFisier("Modul securitate", "BFA");
		modul.verificaActiuneUser(TipActiune.DOWNLOAD, "fisier.txt");
		
		System.out.println("------------------------");
		
		ModulVerificareAbstract modulNou = new ModulVerificareCompleta(modul);
		
		modulNou.verificaActiuneUser(TipActiune.DOWNLOAD, "fisier.txt");
		((ModulVerificareCompleta) modulNou).verificareDimensiuneFisier(TipActiune.DOWNLOAD, "fisier.txt");

	}

}
