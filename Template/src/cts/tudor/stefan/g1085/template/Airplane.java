package cts.tudor.stefan.g1085.template;

public abstract class Airplane {
	String denumire;

	public Airplane(String denumire) {
		this.denumire = denumire;
	}
	
	abstract void preparForTakeOff();
	abstract void run();
	abstract void liftOff();
	
	public final void fly() {
		this.preparForTakeOff();
		this.run();
		this.liftOff();
	}
}
