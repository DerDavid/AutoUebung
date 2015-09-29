package fahrzeuge;

public class Auto {

private int geschwindigkeit;
private String name;
private static int anzahl;

public Auto(){
	}
	public Auto(String name){
		this.name = name;
	}
	public Auto(String name,Integer geschwindigkeit){
		this.name = name;
		this.geschwindigkeit = geschwindigkeit;
		anzahl++;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void beschleunigen(){
		geschwindigkeit++;
	}
	
	public void bremsen(){
		geschwindigkeit--;

			if (geschwindigkeit <= 0)
				geschwindigkeit	= 0;
				
	}
	
	public void anhalten(){
		while (geschwindigkeit > 0)
			geschwindigkeit--;
		
	}
	
	public Integer getGeschwindigkeit(){
		return geschwindigkeit;
		
	}
	
	@Override
	public String toString(){
		return "Das Auto fährt "+getGeschwindigkeit()+" Km/H und heisst: "+getName();
	}
	
	public void hupe(int anzahl){
		for (int i = 0; i < anzahl; i++){
			System.out.print("hup! ");
		}
			System.out.println("");
		
	}
	
	public void hupe(){
		hupe(1);
	}
	
	public static int getAnzahl(){
		
		return anzahl;
	}
}
