public class Carte
{
	// Variables
	private int signe;
	private String nom;
	private int valeur;
	// Définition des Getters et des Setters
	public int getSigne()
	{
		return signe;
	}
	public String getNom()
	{
		return nom;
	}
	public int getValeur()
	{
		return valeur;
	}
	public void setSigne(int signe)
	{
		this.signe=signe;
	}
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	public void setValeur(int valeur)
	{
		this.valeur=valeur;
	}
	// Constructeur par défaut
	public Carte()
	{
		signe=0;
		nom=null;
		valeur=0;
	}
	// Constructeur de Carte
	public Carte (int signe, int value, String name)
	{
		this.signe=signe;
		valeur=value;
		nom=name;
	}
	// Retourner une carte
	public String toString()
	{
		String chaine=null;
		chaine=signe+" "+valeur+" "+nom;
		return chaine;
	}
	/*
	// Fonction principale pour tester la classe Carte
	public static void main(String[] args)
	{
		Carte carte = new Carte(2,4,"4");
		System.out.println(carte.toString());
	}
	*/
}