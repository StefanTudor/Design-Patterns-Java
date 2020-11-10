package cts.tudor.stefan.g1085.program;

import java.util.ArrayList;import org.omg.PortableInterceptor.AdapterStateHelper;

import cts.tudor.stefan.g1085.adapter.AdapterSpital2Farmacie;
import cts.tudor.stefan.g1085.adapter.IMedFarmacie;
import cts.tudor.stefan.g1085.adapter.MedicamentFarmacie;
import cts.tudor.stefan.g1085.adapter.MedicamentSpital;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<IMedFarmacie> medicamente = 
				new ArrayList<IMedFarmacie>();
		
		medicamente.add(new MedicamentFarmacie("Paracetamol"));
		medicamente.add(new MedicamentFarmacie("Algocalmin"));
		
		AdapterSpital2Farmacie medSpital = new AdapterSpital2Farmacie(new MedicamentSpital("Parasinus", "Reteta 1"));
		medicamente.add(medSpital);

		for (IMedFarmacie med : medicamente) {
			med.cumparaMedicament();
		}
		
	}

}
