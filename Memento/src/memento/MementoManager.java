package memento;

import java.util.ArrayList;

public class MementoManager {
	
	private ArrayList<Memento> lista;

	public MementoManager() {
		this.lista = new ArrayList<>();
	}
	
	public void addMemento(Memento meme) {
		lista.add(meme);
		System.out.println("Memento adaugat!");
	}
	
	public Memento getMemento(String data) throws Exception {
		for (Memento meme : lista) {
			if (meme.getData().equals(data)) {
				System.out.println("Data recovered!");
				return meme;
			} 
		}
		throw new Exception("Nu exista memento la data " + data);
	}

}
