package com.ostolski;

import Nutzer.Mechaniker;
import fahrzeuge.Auto;
import fahrzeuge.Cabrio;

public class Typen {

	public static void main(String[] args){
		
		Cabrio cabrio = new Cabrio("Knut");
		Auto auto = new Auto("Karla",100);
		cabrio.oeffneDach();
	
		Mechaniker mechaniker = new Mechaniker();
	
		mechaniker.reparieren(auto);
		mechaniker.reparieren(cabrio);
	
	}
	
}
