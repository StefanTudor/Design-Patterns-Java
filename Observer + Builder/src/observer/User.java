package observer;

public class User implements ITransmitereMesaj {
	
	String nume;

	public User(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}


	@Override
	public void primireMesaj(String user, String mesaj) {
		System.out.println(user + " are o noua notificare: " + mesaj);
		
	}

}
