import java.util.*;
import java.lang.*;

public class TestTrieur {

	final static int ERREUR = -1;

	public static void main(String[] args) throws InputMismatchException, ArrayIndexOutOfBoundsException {
		Scanner clavier = new Scanner(System.in);

		try {
			System.out.print("Donner la taille du tableau : ");
			int taille = clavier.nextInt();
			Trieur tr = new Trieur(taille);

			for (int i = 0; i < taille; i++) {
				try {
					System.out.print("tr[" + i + "] = ");
					tr.tableau[i] = clavier.nextInt();
				} catch(InputMismatchException e) {
					System.out.println(e);
					System.exit(ERREUR);
				}
			}

			Thread tri = new ThreadTrieTableau(tr);
			Thread affiche = new ThreadAfficheTableau(tr);

			tri.run();
			affiche.run();

			tri.interrupt();
			affiche.interrupt();

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.exit(ERREUR);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
			System.exit(ERREUR);
		}

	}

}