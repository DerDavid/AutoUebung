package fahrzeuge;

public class Cabrio extends Auto {
	boolean IstAutoDachOffen;

	
	public Cabrio() {
		super("Anonym");
	}
	public Cabrio(String name) {
		super(name);
	}	
	public Cabrio(String name, Integer geschwindigkeit) {
		super(name, geschwindigkeit);
	}
	public Cabrio(String name, Integer geschwindigkeit,boolean IstAutoDachOffen) {
		super(name, geschwindigkeit);
		this.IstAutoDachOffen = IstAutoDachOffen;
	}


	public void oeffneDach() {
		if (IstAutoDachOffen == true) {
			System.out.println("Das Dach ist bereits Offen");
		} else {
			IstAutoDachOffen = true;
			System.out.println("Das Dach wird geoeffnet");
			}
	}

	public void schliesseDach() {
		if (IstAutoDachOffen == false) {
			System.out.println("Das Dach ist bereits geschlossen");
		} else {
			IstAutoDachOffen = false;
			System.out.println("Das Dach wird geschlossen");
			}
	}

	//Methode Überschreiben
	@Override
	public String toString(){
		return super.toString()+" und das Dach ist "+ (IstAutoDachOffen ? "offen" : "geschlossen");
	}
}
