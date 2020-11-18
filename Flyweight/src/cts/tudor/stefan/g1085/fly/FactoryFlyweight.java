package cts.tudor.stefan.g1085.fly;

import java.util.HashMap;

public class FactoryFlyweight {
	
	private static HashMap<TipExamen, InterfataFlyExamen> examene = 
			new HashMap<>();
	
	public static InterfataFlyExamen getExamen(TipExamen tip) {
		
		//lazy instantiation
		InterfataFlyExamen examen = examene.get(tip);
		
		if(examen == null) {
			switch(tip) {
			case CTS:
				examen = new FlyConcretExamen("CTS", 5);
				break;
			case JAVA:
				examen = new FlyConcretExamen("JAVA", 3);
				break;
			case SDD:
				examen = new FlyConcretExamen("SDD", 4);
				break;
			default:
				throw new UnsupportedOperationException();
			}
			examene.put(tip, examen);
		}
		return examen;
	}

}
