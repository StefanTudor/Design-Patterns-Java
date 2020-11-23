package main;

import strategy.Aparare;
import strategy.Atac;
import strategy.Echipa;

public class Program {

	public static void main(String[] args) {
		
		Echipa FCSB = new Echipa("FCSB");
		
		FCSB.joaca();
		FCSB.setStrategie(new Atac(4));
		FCSB.joaca();
		FCSB.setStrategie(new Aparare(6));
		FCSB.joaca();

	}

}
