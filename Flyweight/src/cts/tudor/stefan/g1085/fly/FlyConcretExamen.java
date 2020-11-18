package cts.tudor.stefan.g1085.fly;

public class FlyConcretExamen implements InterfataFlyExamen {
	
		String numeExamen;
		int credite;
		
		public FlyConcretExamen(String numeExamen, int credite) {
			super();
			this.numeExamen = numeExamen;
			this.credite = credite;
			System.out.println("Creare instanta examen pentru - " + this.numeExamen);
		}

		@Override
		public void sustineExamen(Student stud) {
			System.out.println(stud.getNume() + " sustine examen: " + this.numeExamen);
			System.out.println("Numar credite: " + this.credite);
		}

}
