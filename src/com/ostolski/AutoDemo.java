package com.ostolski;
import fahrzeuge.Auto;
import fahrzeuge.Cabrio;

public class AutoDemo {

	public static void main(String[] args) {
		
		
		Auto[] Autos = new Auto[2];
		Autos[0] = new Auto("Hanna",120);
		Cabrio MeinCabrio = new Cabrio("Frank",0,true);
		Autos[1] = MeinCabrio;	
		
		Autos[0].beschleunigen();
		Autos[1].beschleunigen();
		Autos[0].beschleunigen();
		Autos[0].bremsen();
		Autos[1].bremsen();
		Autos[0].bremsen();
		Autos[0].bremsen();
		Autos[0].hupe(3);
		
		System.out.println(""+Autos[0]);
		Autos[0].anhalten();
		Autos[0].beschleunigen();
		Autos[0].beschleunigen();
		System.out.println(""+Autos[0]);
		
		for (int i = 0; i < Autos.length;i++){
			System.out.println(""+Autos[i]);
		}
		
		Autos[1].beschleunigen();
		Autos[1].beschleunigen();
		Autos[1].bremsen();
		
		MeinCabrio.oeffneDach();
		System.out.println(""+Autos[1]);
		MeinCabrio.oeffneDach();
		MeinCabrio.schliesseDach();		

		for (Auto auto : Autos){
			System.out.println(auto);	
		
		System.out.println("Anzahl: "+Auto.getAnzahl());
		}
		
	}

}
