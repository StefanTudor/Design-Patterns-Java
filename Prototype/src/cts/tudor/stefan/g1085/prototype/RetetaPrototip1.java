package cts.tudor.stefan.g1085.prototype;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RetetaPrototip1 implements IReteta {
	String denumire;
	ArrayList<Double> cantitati;
	

	public RetetaPrototip1(String denumire) {
		this.denumire = denumire;
		
		this.cantitati = new ArrayList<>();
		System.out.println("Se incarca reteta prototip 1!");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("fisier.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				cantitati.add(Double.parseDouble(line));
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Reteta incarcata!");
	}
	
	private RetetaPrototip1() {
		this.denumire = "";
		this.cantitati = null;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setCantitati(ArrayList<Double> cantitati) {
		this.cantitati = cantitati;
	}
	

	@Override
	public String toString() {
		return "RetetaPrototip1 [denumire=" + denumire + ", cantitati=" + cantitati + "]";
	}

	@Override
	public IReteta cloneaza() {
		RetetaPrototip1 copie = new RetetaPrototip1();
		copie.denumire = this.denumire;
		
		ArrayList<Double> temp = new ArrayList<Double>();
		for (Double cantitate : cantitati) {
			temp.add(cantitate);
		}
		copie.setCantitati(temp);
		return copie;
	}
}
