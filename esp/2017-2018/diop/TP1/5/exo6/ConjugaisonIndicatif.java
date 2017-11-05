import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ConjugaisonIndicatif
{
	private String verbe;
	private String[] pronoms={"Je","Tu","Il/Elle","Nous","Vous","Ils/Elles"};
	private String[] terminaisonPresent = {"e","es","e","ons","ez","ent"};
	private String[] terminaisonPasse = {"ai","as","a","ames","ates","erent"};
	private String[] terminaisonFutur = {"erai","eras","era","erons","erez","eront"};
	private String[] terminaisonImparfait = {"ais","ais","ait","ions","iez","aient"};

	public String getVerbe() {
		return this.verbe;
	}

	public String getPronoms(int index) {
		return this.pronoms[index];
	}

	public String getTerminaisonPresent(int index) {
		return this.terminaisonPresent[index];
	}

	public String getTerminaisonPasse(int index) {
		return this.terminaisonPasse[index];
	}

	public String getTerminaisonFutur(int index) {
		return this.terminaisonFutur[index];
	}

	public String getTerminaisonImparfait(int index) {
		return this.terminaisonImparfait[index];
	}

	public void setVerbe(String verbe) throws IllegalArgumentException {
		if (verbe.endsWith("er"))
			this.verbe = verbe;
		else {
			afficherAide();
			throw new IllegalArgumentException("Vous n'avez pas saisi un verbe du premier groupe.");
		}
	}

	public ConjugaisonIndicatif (String verbe) {
		this.setVerbe(verbe);
	}

	public void present() {
		String radical = this.getVerbe().substring(0, this.getVerbe().length() - 2);
		System.out.println("\nVerbe " + this.getVerbe() + " au présent :");
		for(int i = 0; i < 6; i++) {
			System.out.println("\t" + this.getPronoms(i) + " " + radical + this.getTerminaisonPresent(i));
		}
	}

	public void passe() {
		String radical = this.getVerbe().substring(0, this.getVerbe().length() - 2);
		System.out.println("\nVerbe " + this.getVerbe() + " au passé :");
		for(int i = 0; i < 6; i++) {
			System.out.println("\t" + this.getPronoms(i) + " " + radical + this.getTerminaisonPasse(i));
		}
	}

	public void futur() {
		String radical = this.getVerbe().substring(0, this.getVerbe().length() - 2);
		System.out.println("\nVerbe " + this.getVerbe() + " au futur :");
		for(int i = 0; i < 6; i++) {
			System.out.println("\t" + this.getPronoms(i) + " " + radical + this.getTerminaisonFutur(i));
		}
	}

	public void imparfait() {
		String radical = this.getVerbe().substring(0, this.getVerbe().length() - 2);
		System.out.println("\nVerbe " + this.getVerbe() + " à l'imparfait :");
		for(int i = 0; i < 6; i++) {
			System.out.println("\t" + this.getPronoms(i) + " " + radical + this.getTerminaisonImparfait(i));
		}
	}

	public static void afficherAide() {
		System.out.println("\nAide");
		System.out.println("\tjava TestConjugaisonIndicatif");
		System.out.println("\t\tLe programme vous demande le verbe que vous souhaitez conjuguer, puis le temps de conjugaison.");
		System.out.println("\t\tSi vous ne mettez rien pour le temps, on considère que la conjugaison se fera sur tous les temps.");
		System.out.println("\tjava TestConjugaisonIndicatif –v verbeAConjuguer");
		System.out.println("\t\tLe programme donnera en sortie la conjugaison du verbe spécifié dans tous les temps (passé, futur, etc.)");
		System.out.println("\tjava TestConjugaisonIndicatif –v verbeAConjuguer –t tempsDeConjugaison");
		System.out.println("\t\tLe programme donnera en sortie la conjugaison du verbe au temps spécifié.");
		System.out.println("\t\tL’option « -t » ne pourra prendre que les valeurs « présent », « passé », « imparfait » et « futur ».");
		System.out.println("\tjava TestConjugaisonIndicatif –h");
		System.out.println("\t\tDevra fournir en sortie l’aide du programme qui donne les instructions sur l’utilisation du programme.");
		System.out.println("\t\tCette aide devrait aussi être affichée à chaque fois que les options « -v » ou « -t » sont fournies avec une valeur incorrecte.");
		System.out.println("");
	}

	public static void main(String[] args) throws IllegalArgumentException, NumberFormatException {
		boolean erreur = false;
		Scanner sc = new Scanner(System.in);
		String saisi = new String();
		String[] temps = {"présent", "passé", "futur", "imparfait"};
		ConjugaisonIndicatif verbe;
		switch (args.length) {
			case 0:
				System.out.print("Saisissez le verbe que vous voulez conjuguer: ");
				saisi = sc.nextLine();
				verbe = new ConjugaisonIndicatif(saisi);
				do {
					System.out.print("Donnez le temps de conjugaison: ");
					saisi = sc.nextLine();
				} while(!(saisi.equals("") || saisi.equals(temps[0]) || saisi.equals(temps[1]) || saisi.equals(temps[2]) || saisi.equals(temps[3])));
				if (saisi.equals("")) {
					verbe.present();
					verbe.passe();
					verbe.futur();
					verbe.imparfait();
				}
				else if (saisi.equals(temps[0]))
					verbe.present();
				else if (saisi.equals(temps[1]))
					verbe.passe();
				else if (saisi.equals(temps[2]))
					verbe.futur();
				else if (saisi.equals(temps[3]))
					verbe.imparfait();
				break;
			case 1:
				if (!(args[0].equals("-h")) && !(args[0].equals("--help"))) {
					erreur = true;
					break;
				}
				afficherAide();
				break;
			case 2:
				if (!(args[0].equals("-v"))) {
					erreur = true;
					break;
				}
				verbe = new ConjugaisonIndicatif(args[1]);
				verbe.present();
				verbe.passe();
				verbe.futur();
				verbe.imparfait();
				break;
			case 4:
				if (!(args[0].equals("-v")) || !(args[2].equals("-t")) || !(args[3].equals(temps[0]) || args[3].equals(temps[1]) || args[3].equals(temps[2]) || args[3].equals(temps[3]))) {
					erreur = true;
					if (!(args[3].equals(temps[0]) || args[3].equals(temps[1]) || args[3].equals(temps[2]) || args[3].equals(temps[3])))
						afficherAide();
					break;
				}
				verbe = new ConjugaisonIndicatif(args[1]);
				if (args[3].equals(temps[0]))
					verbe.present();
				else if (args[3].equals(temps[1]))
					verbe.passe();
				else if (args[3].equals(temps[2]))
					verbe.futur();
				else if (args[3].equals(temps[3]))
					verbe.imparfait();
				break;
			default:
				erreur = true;
				break;
		}
		if (erreur) {
			throw new IllegalArgumentException("Commande non connue. Tapez -h ou --help pour voir l'aide.");
		}
	}
}
