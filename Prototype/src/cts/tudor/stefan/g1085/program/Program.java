package cts.tudor.stefan.g1085.program;

import cts.tudor.stefan.g1085.prototype.IReteta;
import cts.tudor.stefan.g1085.prototype.RetetaPrototip1;

public class Program {

	public static void main(String[] args) {
		
		IReteta reteta1 = new RetetaPrototip1("Reteta COVID-19");
		IReteta reteta2 = reteta1.cloneaza();
		((RetetaPrototip1) reteta2).setDenumire("Reteta malarie");
		
		System.out.println(reteta1.toString());
		System.out.println(reteta2.toString());
		
		System.out.println("Medicamente create");

	}

}
