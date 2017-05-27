import java.util.Random;
public class Belote
{
	// Variables
	public static Carte [] tabCartes = new Carte [52];
	public static Joueur [] tabJoueurs = new Joueur [4];
	// Constructeur du jeu Belote
	public Belote()
	{
		// Création de 4 joueurs
		tabJoueurs[0] = new Joueur("Doudou");
		tabJoueurs[1] = new Joueur("Lamine");
		tabJoueurs[2] = new Joueur("Fatou");
		tabJoueurs[3] = new Joueur("Dieynaba");
		// Correspondance nom-valeur
		String correspondance(int k)
		{
			if (k=11)
				return "valet";
			if (k=12)
				return "dame";
			if (k=13)
				return "roi";
			return valueOf(k);
		}
		// Création de 52 cartes
		int i,j,nombreCartes=0;
		for (i=0; i<4; i++)
		{
			for (j=0; j<13; j++)
			{
				tabCartes[nombreCartes] = new Carte(i,j+1,correspondance(j+1));
				nombreCartes++;
			}
		}
		// Distribution des 52 cartes
		Carte carte = new Carte();
		int position;
		boolean bonnePlace=false;
		for (i=0; i<4; i++)
		{
			for (j=0; j<13; j++)
			{
				bonnePlace=false;
				do
				{
					Random rand = new Random();
					position=rand.nextInt(51);
					carte=tabCartes[position];
					if (carte!=null)
					{
						bonnePlace=true;
						tabJoueurs[i].ajoutCarte(carte);
						carte=null;
					}
				}while(bonnePlace=false);
			}
		}
	}
	// Qui jouera en premier
	public Joueur premier()
	{
		Random rand = new Random();
		int qui=rand.nextInt(3);
		return qui;
	}
	// Fonction Main pour créer une instance Belote et simuler le jeu
	public static void main(String[] args)
	{
		Belote jeu = new Belote();
		Carte[] carte = new Carte[4]; 
		int i,signe=0,tour=0,tourGagnant=0,win=0;
	    do
	    {
	    	for(i=0; i<4; i++)
	    	{
				if(i==0)
				{
				jeu[tourGagnant]=jeu.tabJoueurs(tourGagnant).playFirst();
				signe=jeu[tourGagnant].getSigne();
				}
				else
				jeu[tourGagnant]=jeu.tabJoueurs(tourGagnant).play(signe);

				System.out.print(jeu.tabJoueurs(tourGagnant).getName() + " ");
				affiche(jeu[tourGagnant]);

				if(++tourGagnant==4)
				tourGagnant=0;
	    	}
	    	for(i=0; i<3; i++)
	    	{
	    			if(jeu[i].getValeur()<jeu[i+1].getValeur())
	    			{
	    				if(jeu[i+1].getSigne()==signe)
	    					win=i+1;
	    			}
	    			else
	    			{
	    				if(jeu[i].getSigne()==signe)
	    					win=i;
	    			}
	    	}
	    	jeu.tabJoueurs(win).tourGagnant(jeu);
	    	System.out.println(jeu.tabJoueurs(win).getName() + " gagne le tour " + tour + " avec un score de " + jeu.tabJoueurs(win).getScore() + "\n");
	    
	    	tourGagnant=win;
	    	tour++;
	    }while(jeu.tabJoueurs(0).getCompteur()!=0);
	    for(i=0; i<3; i++)
	    {
	    	if(jeu.tabJoueurs(i+1).getScore()>jeu.tabJoueurs(i).getScore())
	    		win=i+1;
	    	else
	    		win=i;
	    }
	    System.out.println("******FELICITATION*********\n" + jeu.tabJoueurs(win).getName() + " gagne avec un score de: " + jeu.tabJoueurs(win).getScore() + "***************************");
	}
	public static void afficher_carte(Joueur joueur)
	{
		System.out.println(joueur.getName() + " quelle est la carte choisie?  ");
		for(i=0; i<13; i++)
			System.out.println(i + " --> " + joueur.getTMain(i).toString());
	}
	public static void affiche(Carte carte)
	{
		System.out.println(" Vous avez : " + carte.toString());
	}
	}
}