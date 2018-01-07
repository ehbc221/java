public class TestCoureur {
	public static void main (String [ ] args) {
		// Il s'agit d'une classe de coureurs
		System.out.println ("Passage aux : ");
		Coureur j = new Coureur ("Margaret");
		Coureur p = new Coureur ("Irene");
		// On lance les deux coureurs.
		j.start();
		p.start();
		try {
			j.join();
			p.join(); // attendre la mort de j et p
			// avant de commencer k
		} catch(InterruptedException e) {};
		Coureur k = new Coureur("Janet");
		k.start() ;
	}
}