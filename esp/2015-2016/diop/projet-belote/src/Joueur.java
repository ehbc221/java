import java.util.*;
public class Joueur
{
	// Variables
	private String nom;
	private int score;
	private int compteur;
	private Carte [] main;
	// Définition des Getters et des Setters
	public String getNom()
	{
		return nom;
	}
	public int getScore()
	{
		return score;
	}
	public int getCompteur()
	{
		return compteur;
	}
	public Carte getMain(int i)
	{
		return main[i];
	}
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	public void setScore(int score)
	{
		this.score=score;
	}
	public void setCompteur(int compteur)
	{
		this.compteur=compteur;
	}
	public void setMain(int i,Carte carte)
	{
		main[i]=carte;
	}
	// Constructeur de Joueur
	public Joueur (String name)
	{
		int i=0;
		score=0;
		compteur=0;
		for (i=0; i<13; i++)
		{
			main[i] = new Carte();
		}
		nom=name;
	}
	// Ajouter une carte à la main du joueur
	public void ajoutCarte (Carte carte)
	{
		this.setMain(compteur,carte);
		this.compteur++;
	}
	// Tirer la carte que le joueur joue en premier
	public Carte jouerEnPremier()
	{
		int i;
		for (i=0; i<13; i++)
		{
			if (main[i]!=null)
			{
				Carte carte = new Carte();
				carte=main[i];
				main[i]=null;
				this.compteur--;
				return carte;
			}
		}
		return null;
	}
	// La carte que les autres doivent jouer après que le 1er joueur en ait posé une
	public Carte play(int signe)
	{
		int i;
		Carte carte = new Carte();
		for (i=0; i<13; i++)
		{
			if (getMain(i).getSigne()==signe)
			{
				carte=getMain(i);
				main[i]=null;
				this.compteur--;
				return carte;
			}
		}
		int pos=0,min=13;
		for (i=0; i<13; i++)
		{
			if (getMain(i).getValeur()<min)
			{
				pos=i;
				min=getMain(i).getValeur();
				carte=getMain(i);
			}
		}
		main[pos]=null;
		this.compteur--;
		return carte;
	}
	// Mettre à jour le score du joueur qui a gagné la main
	public void tourGagnant(Carte[] carte)
	{
		this.score+=carte[0].getValeur()+carte[1].getValeur()+carte[2].getValeur()+carte[3].getValeur();
	}
}