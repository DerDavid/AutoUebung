package Nutzer;

import fahrzeuge.Auto;
import fahrzeuge.Cabrio;

public class Mechaniker {

	public void reparieren(Auto auto){
		
		System.out.println("Ich repariere " + auto.getName());
		System.out.println(auto);
		if (auto instanceof Cabrio){
			Cabrio c = (Cabrio) auto;
			
			c.schliesseDach();
			
		}
		
	}

}
