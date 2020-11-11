package command;

public class Comanda implements IClientBursa {
	
	private Broker broker;
	
	private String nume;
	private String stare;
	private String tip;
	private int nrActiuni;
	private String codActiuni;
	

	public Comanda(Broker broker, String nume, int nrActiuni, String codActiuni) {
		super();
		this.broker = broker;
		this.nume = nume;
		this.nrActiuni = nrActiuni;
		this.codActiuni = codActiuni;
	}
	

	public String getNume() {
		return nume;
	}

	public int getNrActiuni() {
		return nrActiuni;
	}


	public String getCodActiuni() {
		return codActiuni;
	}

	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}


	@Override
	public void vinde(String codActiuni, int nrActiuni) {
		this.setTip("vanzare");
		broker.addComanda(this);
		
	}

	@Override
	public void cumpara(String codActiuni, int nrActiuni) {
		this.setTip("cumparare");
		broker.addComanda(this);
		
	}

}
