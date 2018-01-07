import java.util.Random;

public class Coureur extends Thread {

	private String nom;
	final int distanceMax = 1000;
	final int bond = 100;

	public Coureur(String nom) {
		this.nom = nom;
	}

	public void run() {
		try {
			Random randomGenerator = new Random();
			int i = 0;
			while (i < distanceMax / bond) {
				int pause = randomGenerator.nextInt(100);
				sleep(pause);
				i++;
				System.out.println(i *bond + "m par " + this.nom);
			}
			System.out.println(this.nom + " est arrive");
		} catch(InterruptedException e) {}
	}
	
}