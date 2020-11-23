package cts.tudor.stefan.g1085.main;

import cts.tudor.stefan.g1085.template.Airbus;
import cts.tudor.stefan.g1085.template.Boeing;

public class Main {

	public static void main(String[] args) {
		Airbus airbus = new Airbus("A320");
		airbus.fly();
		
		System.out.println("--------------------------------");
		
		Boeing boeing = new Boeing("B737");
		boeing.fly();

	}

}
