public class Trieur {

	int tableau[];

	public Trieur(int taille) throws ArrayIndexOutOfBoundsException {
		if (taille < 0) {
			throw new ArrayIndexOutOfBoundsException("La taille du tableau ne doit pas etre negative.");
		} else {
			this.tableau = new int[taille];
		}
	}

	public synchronized int[] triTableau (int t[]) throws InterruptedException {
		int taille = t.length;
		boolean permutter;
		int tampon;
		do {
			permutter = false;
			for (int i = 0; i < taille - 1; i++) {
				if (t[i] > t[i+1]) {
					echanger(t, i, i+1);
					permutter = true;
				}
			}
		} while (permutter);
		return t;
	}

	public void echanger(int t[], int i, int j) {
		try {
			int tampon = t[i];
			t[i] = t[j];
			t[j] = tampon;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "Indice inexistants dans le tableau.");
		}
	}

	public synchronized void affiche() throws InterruptedException {
		System.out.print("[ ");
		for (int i = 0; i < this.tableau.length; i++) {
			System.out.print(this.tableau[i] + " ");
		}
		System.out.println("]");
	}

}

class ThreadTrieTableau extends Thread implements Runnable {

	private Trieur tr;

	public ThreadTrieTableau(Trieur t) {
		this.tr = new Trieur(t.tableau.length);
		System.arraycopy(t.tableau, 0, this.tr.tableau, 0, t.tableau.length);
	}

	public void run() {
		try {
			if (!Thread.currentThread().isInterrupted()) {
				System.arraycopy(this.tr.triTableau(this.tr.tableau), 0, this.tr.tableau, 0, this.tr.triTableau(this.tr.tableau).length);
			}
		} catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
	}

}

class ThreadAfficheTableau extends Thread implements Runnable {

	private Trieur tr;

	public ThreadAfficheTableau(Trieur t) {
		this.tr = new Trieur(t.tableau.length);
		System.arraycopy(t.tableau, 0, this.tr.tableau, 0, t.tableau.length );
	}

	public void run() {
		try {
			if (!Thread.currentThread().isInterrupted()) {
				this.tr.affiche();
			}
		} catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
	}

}
