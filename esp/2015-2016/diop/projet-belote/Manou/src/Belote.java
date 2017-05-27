package game;
import java.util.*;
public class Belote 
{
	static Scanner read=new Scanner(System.in);
	private Carte[] tabCarte=new Carte[52];
	private Joueur[] tabJoueur=new Joueur[4];
	
	
		
	public Belote()
	{	
		    String nomCarte[]={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "roi", "dame", "valet"};
		    String nomJoueur[]={"Doudou", "Lamine", "Fatou", "Dieynaba"};
		    
		    
		    /*  ***CREATION DE 4 JOUEUR DOUDOU LAMINE FATOU DIEYNABA***  */
			for(int i=0;i<4;i++)
				tabJoueur[i]=new Joueur(nomJoueur[i]); // initialise la classe joueur 4 joueurs
			
			
			/*   *****CREATION DE 52 CARTES*******   */
			
		    int compteur=0; // compteur me permet de controler la creation de 52 carte compteur doit etre une variable local pour eviter quelle soit remise a zero dans le second for
			for(int j=0;j<4;j++)                         //une premiere iteration de 0 a 4 exclu pour definr le signe de la carte
			{                                            
				for(int z=0;z<13;z++)     //une dexieme itteration de 0 a 13 exclue pour assigner a chaque signe d'une carte sa valeur et son nom 
				{
					tabCarte[compteur]=new Carte(j, z+1, nomCarte[z]);//ainsi on initialise chaque carte avec son constructeur qui prend le signe(valeur du premier for) puis le signe(valeur de second for) puis le nom pris dans le tableau de nomcarte
					compteur++; //incrementation du compteur (rappel elle definit les 52 cartes
		        }
			}
			
			
			/*  *****PARTAGE DES CARTES AU 4 JOUEURS DE MANIERE ALEATOIRE*/
			
			compteur=51;//compteur initialisé a 51 pour faire un choix  des cartes entre 0 et 51 qui sera decrementé a chaque prise de carte
			
			for(int i=0;i<4;i++)   //une premiere iteration de 0 a 4 exclu pour definr le joueurs
			{
				for(int j=0;j<13;j++)  ////une dexieme itteration de 0 a 13 exclue pour assigner a 13 a chaque joueurs
				{
					Random rand = new Random(); // initialisation de random
					int nombreAleatoire = rand.nextInt(compteur - 0 + 1) + 0;// choisit un nombre entre 0 et compteur(nombre de carte restant) qui sera la carte  aprendre ds le tableau de carte
					tabJoueur[i].addCarte(tabCarte[nombreAleatoire], j);//on appel addCarte de la classe joueur qui ajoute une carte au joueurs
					Carte tmp=tabCarte[compteur];//tmp recoit la valaur de la carte choisit qu'il mettra a la fin de tableau POUR eviter qune carte soit choit plusieur fois
					tabCarte[compteur]=tabCarte[nombreAleatoire];
					tabCarte[nombreAleatoire]=tmp;
				    compteur--;
				}
				tabJoueur[i].setCarteRecord(13);
			}	
	}
	
	/*   mutateur ascensseur */
	public Carte getTabCarte(int i)
	{
		return tabCarte[i];
	}
	public Joueur getTabJoueur(int i)
	{
		return tabJoueur[i];
	}
	public void setTabCarte(Carte cCarte, int i)
	{
		tabCarte[i]=cCarte;
	}
	public void setTabJoueur(Joueur cJoueur, int i)
	{
		tabJoueur[i]=cJoueur;
	}

	  /*  CLASSE MAIN POUR SIMULER LE JEU  */
	public static void main(String[] args)
	{
		Carte[] carteJouer = new Carte[4]; 
		int playWine=0, tour=0;
		int signe=0, wine=0;
		Belote game=new Belote();
	    
	    do
	    {
	    	
	    	//System.out.println(game.getTabJoueur(playWine).getName());
	    	//System.out.println(tour);
	    	for(int i=0; i<4; i++)
	    	{
	    		  if(i==0)
	    		  {
	    			carteJouer[playWine]=game.getTabJoueur(playWine).playFirst();
	    			signe=carteJouer[playWine].getSigne();
	    		  }
		    	  else
		    		carteJouer[playWine]=game.getTabJoueur(playWine).play(signe);
	    		    
	    		    System.out.print(game.getTabJoueur(playWine).getName() + " ");
		    		afficher_carte_jouer(carteJouer[playWine]);
		    		
				  if(++playWine==4)
					  playWine=0;
				 
	    	}
	   
	    	for(int i=0; i<3; i++)
	    	{
	    			if(carteJouer[i].getValue()<carteJouer[i+1].getValue())
	    			{
	    				if(carteJouer[i+1].getSigne()==signe)
	    					wine=i+1;
	    			}
	    			else
	    			{
	    				if(carteJouer[i].getSigne()==signe)
	    					wine=i;
	    			}
	    	}
	    	game.getTabJoueur(wine).tourwine(carteJouer);
	    	System.out.println(game.getTabJoueur(wine).getName() + " vous avez gagnez cet tour " + tour + " votre score est " + game.getTabJoueur(wine).getScore() + "\n");
	    
	    	playWine=wine;
	    	tour++;
	    }while(game.getTabJoueur(0).getCarteRecord()!=0);
	    for(int i=0; i<3; i++)
	    {
	    	if(game.getTabJoueur(i+1).getScore()>game.getTabJoueur(i).getScore())
	    		wine=i+1;
	    	else
	    		wine=i;
	    }
	    System.out.println("******FELICITATION*********\n" + game.getTabJoueur(wine).getName() + " vous etes le grand gagnant avec un score de: " + game.getTabJoueur(wine).getScore());
	}
	
	public static void afficher_carte(Joueur player)
	{
		System.out.println(player.getName() + " quelle carte voulez vous jouer: ");
		for(int i=0; i<13; i++)
			System.out.println(i + ": " + player.getTCarte(i).toString());
	}
	public static void afficher_carte_jouer(Carte player)
	{
		System.out.println(" vous avez jouer : " + player.toString());
	}

}
