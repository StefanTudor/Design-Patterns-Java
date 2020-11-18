package cts.tudor.stefan.g1085.program;

import cts.tudor.stefan.g1085.fly.FlyConcretExamen;
import cts.tudor.stefan.g1085.fly.FactoryFlyweight;
import cts.tudor.stefan.g1085.fly.Student;
import cts.tudor.stefan.g1085.fly.TipExamen;

public class program {

	public static void main(String[] args) {
		
		FlyConcretExamen ex1 = (FlyConcretExamen) FactoryFlyweight.getExamen(TipExamen.CTS);
		FlyConcretExamen ex2 = (FlyConcretExamen) FactoryFlyweight.getExamen(TipExamen.JAVA);
		FlyConcretExamen ex3 = (FlyConcretExamen) FactoryFlyweight.getExamen(TipExamen.CTS);
		
		ex1.sustineExamen(new Student("Tudor"));
		ex2.sustineExamen(new Student("Mihai"));
		ex3.sustineExamen(new Student("Alex"));


	}

}
