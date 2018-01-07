public class BanqueRunnable {
	
	private Compte listeComptes[];
	private int nombreComptes;

	public BanqueRunnable(int nombreMaxComptes) {
		this.listeComptes = new Compte[nombreMaxComptes];
		this.nombreComptes = 0;
	}

	public class Compte {
		String prenom;
		String nom;
		int numCompte;
		int solde;
		int decouvert;

		public Compte(String prenom, String nom, int solde, int decouvert) {
			this.prenom = prenom;
			this.nom = nom;
			this.numCompte = listeComptes.length + 1;
			this.solde = solde;
			this.decouvert = decouvert;
			listeComptes[nombreComptes] = this;
			nombreComptes++;
		}

		public synchronized void crediter(int montant) throws InterruptedException {
			this.solde += montant;
		}

		public synchronized void debiter(int montant) throws InterruptedException {
			this.solde -= montant;
		}

		public String getPrenom() {
			return this.prenom;
		}

		public String getNom() {
			return this.nom;
		}

		public int getSolde() {
			return this.solde;
		}

		public int getDecouvert() {
			return this.decouvert;
		}

		public void setDecouvert(int decouvert) {
			this.decouvert = decouvert;
		}

		public void getHistorique() {
			System.out.println("Solde du compte : " + this.solde);
		}

		public String affiche() {
			return ("Prenom : " + this.getPrenom() + ", Nom : " + this.getNom() + ", Solde : " + this.getSolde() + ", Decouvert : " + this.getDecouvert());
		}

	}

}

/**
 * Cette classe crée un thread pour le crédit et s'assure qu'il n'y a pas concurrence entre ce dernier et le thread gérant le débit
 * Ceci étant fait avec les appels de synchronized(), isInterrupted(), run() et interrupt()
 *
 */
class ProcessBankCreditRunnable extends Thread implements Runnable {

	private BanqueRunnable.Compte c;
	private int montant;

	public ProcessBankCreditRunnable(BanqueRunnable.Compte c, int montant) {
		this.c = c;
		this.montant = montant;
	}

	public void run() {
		try {
			if (!Thread.currentThread().isInterrupted()) {
				this.c.crediter(this.montant);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
	}

}

/**
 * Cette classe crée un thread pour le débit et s'assure qu'il n'y a pas concurrence entre ce dernier et le thread gérant le crédit
 * Ceci étant fait avec les appels de synchronized(), isInterrupted(), run() et interrupt()
 *
 */
class ProcessBankDebitRunnable extends Thread implements Runnable {

	private BanqueRunnable.Compte c;
	private int montant;

	public ProcessBankDebitRunnable(BanqueRunnable.Compte c, int montant) {
		this.c = c;
		this.montant = montant;
	}

	public void run() {
		try {
			if (!Thread.currentThread().isInterrupted()) {
				this.c.debiter(this.montant);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
	}

}