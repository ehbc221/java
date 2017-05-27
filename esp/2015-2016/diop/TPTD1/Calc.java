public class Calc
{
	public static void main(String args[])
	{
		int m,n,resultat;
		if (args[1]!="+" && args[1]!="-" && args[1]!="*" && args[1]!="/")
			System.out.println("Erreur a la place de l'operateur.");
		else
		{
			m=parseInt(args[0]);
			m=parseInt(args[1]);
			if (args[1]!="+")
				resultat=m+n;
			if (args[1]!="-")
				resultat=m-n;
			if (args[1]!="*")
				resultat=m*n;
			if (args[1]!="/")
				resultat=m/n;
			System.out.println("Resultat = " + resultat);
		}
	}
}