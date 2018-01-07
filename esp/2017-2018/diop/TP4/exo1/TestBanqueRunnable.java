public class TestBanqueRunnable {

	public static void main(String[] args) {
		int nombreMaxComptes = 100;
		BanqueRunnable b = new BanqueRunnable(nombreMaxComptes);
		BanqueRunnable.Compte c1 = b.new Compte("Cisse", "El Hadj Babacar", 250000, 25000);
		BanqueRunnable.Compte c2 = b.new Compte("Tiller", "Bryson", 500000, 30000);
		BanqueRunnable.Compte c3 = b.new Compte("Lanez", "Tory", 300000, 30000);

		System.out.println("C1 : " + c1.affiche());
		System.out.println("c2 : " + c2.affiche());
		System.out.println("c3 : " + c3.affiche());

		ProcessBankCreditRunnable t1c = new ProcessBankCreditRunnable(c1, 12000);
		ProcessBankDebitRunnable t1d = new ProcessBankDebitRunnable(c1, 2000);

		t1c.run();
		t1d.run();
		t1c.interrupt();
		t1d.interrupt();

		System.out.println("C1 apres credit et debit : " + c1.affiche());

	}

}