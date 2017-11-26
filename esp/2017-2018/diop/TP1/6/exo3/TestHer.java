import hertpoly.*;

public class TestHer {

	public static void main (String [] args) {
		HertPoly h = new HertPoly (3);
		h.ajoutValeur (new Entier (25));
		h.ajoutValeur (new Flottant (1.25f)) ;
		h.ajoutValeur (new Entier (42)) ;
		h.ajoutValeur (new Char ('A')) ;
		h.affiche ();
	}

}