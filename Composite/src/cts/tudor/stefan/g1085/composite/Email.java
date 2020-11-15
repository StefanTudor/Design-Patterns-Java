package cts.tudor.stefan.g1085.composite;

public class Email {
	
	protected String expeditor;
	protected String titlu;
	protected String descriere;
	
	public Email(String expeditor, String titlu, String descriere) {
		super();
		this.expeditor = expeditor;
		this.titlu = titlu;
		this.descriere = descriere;
	}

	public String getExpeditor() {
		return expeditor;
	}

	public String getTitlu() {
		return titlu;
	}

	public String getDescriere() {
		return descriere;
	}

}
