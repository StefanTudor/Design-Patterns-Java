package cts.tudor.stefan.g1085.composite;

public interface NodAbstractStructura {

	//metode specifice unui nod intermediar
	public abstract void arhivare(Email email);
	public abstract void citeste(Email email);
	
	//metode specifice unui grup
	public abstract void adaugaClient(NodAbstractStructura client);
	public abstract void stergeClient(int index);
	public abstract NodAbstractStructura getClient(int index);

}
