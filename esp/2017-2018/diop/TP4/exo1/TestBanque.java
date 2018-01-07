public class TestBanque {

	public static void main(String[] args) {
		int nombreMaxComptes = 100;
		Banque b = new Banque(nombreMaxComptes);
		Banque.Compte c1 = b.new Compte("Cisse", "El Hadj Babacar", 250000, 25000);
		Banque.Compte c2 = b.new Compte("Tiller", "Bryson", 500000, 30000);
		Banque.Compte c3 = b.new Compte("Lanez", "Tory", 300000, 30000);

		System.out.println("C1 : " + c1.affiche());
		System.out.println("c2 : " + c2.affiche());
		System.out.println("c3 : " + c3.affiche());

		ProcessBankCredit t1c = new ProcessBankCredit(c1, 12000);
		ProcessBankDebit t1d = new ProcessBankDebit(c1, 12000);

		t1c.start();
		t1d.start();
		t1c.interrupt();
		t1d.interrupt();

		System.out.println("C1 apres credit et debit : " + c1.affiche());

	}

}