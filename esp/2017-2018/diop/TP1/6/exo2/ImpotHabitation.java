import habitation.*;

class ImpotHabitation {
	
	public static void main(String[] args) {
		Habitation[] h = new Habitation[4];

		Habitation hab1 = new HabitationIndividuelle("El Hadj Babacar Cissé", "Hann Mariste", 3000, 7, false);
		Habitation hab2 = new HabitationIndividuelle("Khoudieu Diakhaté", "Pout", 7000, 12, true);
		Habitation hab3 = new HabitationProfessionnelle("Modou Khoulé", "Koumpèntoum", 12000, 60);
		Habitation hab4 = new HabitationProfessionnelle("Serigne Modou Syclète Fall", "Ndanda Fall", 100000, 250);
		h[0] = hab1;
		h[1] = hab2;
		h[2] = hab3;
		h[3] = hab4;
		for (int i = 0; i < 4; i++) {
			h[i].affiche();
			System.out.println("Impot : " + h[i].impot() + "F\n");
		}

	}

}