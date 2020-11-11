package main;

import chain.ModulDescarcare;
import chain.TipActiune;
import chain.VerificareEXE;
import chain.VerificareHTTPS;
import chain.VerificarePDF;

public class Main {

	public static void main(String[] args) {
		
		VerificareEXE exe = new VerificareEXE();
		VerificarePDF pdf = new VerificarePDF();
		VerificareHTTPS https = new VerificareHTTPS();
		ModulDescarcare descaracre = new ModulDescarcare();
		
		exe.setNext(pdf);
		pdf.setNext(https);
		https.setNext(descaracre);
		
		//exe.verificaActiuneUser(TipActiune.DOWNLOAD, "FISIER.exe");
		exe.verificaActiuneUser(TipActiune.DOWNLOAD, "FISIERe.pdf");
		//exe.verificaActiuneUser(TipActiune.LINK, "link.https");

	}

}
