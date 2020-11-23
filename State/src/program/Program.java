package program;

import state.Loc;

public class Program {
	
	public static void main(String[] args) {
		
		Loc loc = new Loc(22);
		loc.elibereaza();
		loc.ocupa();
		loc.ocupa();
		loc.elibereaza();
		
	}

}
