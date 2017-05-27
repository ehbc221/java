import java.math.*;
public class Exo4
{
	public static boolean estUnEntier(String chaine)
	{
		try
		{
			Integer.parseInt(chaine);
		}
			catch (NumberFormatException e)
			{
				return false;
			}
		return true;
	}
	public static void main(String args[])
	{
		int nombre1=0,nombre=0,resultat=0;
		if (/*La 1ere chaine n'est pas un entier*/ 						(estUnEntier(args[0])==false) ||
			/*OUBIEN La 2nde chaine n'est pas l'operateur d'addition*/	(args[1]!="+") ||
			/*OUBIEN La 3eme chaine n'est pas un entier*/				(estUnEntier(args[2])==false) )
		{
			System.out.println("Erreur(s) dans la syntaxe.");
		}
		else
		{
			nombre1=parseInt(args[0]);
			nombre2=parseInt(args[1]);
			resultat=nombre1+nombre2;
			System.out.println("Resultat = " + resultat);
		}
	}
}