import habitation.*;

public class TestHabitation {
	
	public static void main(String[] args) {
		Habitation hab = new Habitation("El Hadj Babacar Cissé", "Hann Mariste", 3000);
		hab.affiche();
		System.out.println("Impot : " + hab.impot() + "F");
	}

}