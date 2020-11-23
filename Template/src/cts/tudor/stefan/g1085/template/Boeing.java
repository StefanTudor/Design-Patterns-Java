package cts.tudor.stefan.g1085.template;

public class Boeing extends Airplane {

	public Boeing(String denumire) {
		super(denumire);
	}

	@Override
	void preparForTakeOff() {
		System.out.println(this.denumire + " se pregateste pentru decolare!");
		
	}

	@Override
	void run() {
		System.out.println(this.denumire + " ruleaza pe pista!");
		
	}

	@Override
	void liftOff() {
		System.out.println(this.denumire + " este in aer!");
		
	}

}
