// Supposons que l'utilisateur passe le mot en argument dans la ligne de commande EX: java Pal3 "mot"
public class Exo2q3
{
	static boolean booleen(String[] chaine)
	{
		int l=chaine.length, i=0;
		boolean test=true;
		while (i<l && test==true)
		{
			if ( chaine[0].charAt(i)!=chaine[0].charAt(l-i-1) )
			{
				test=false;
			}
			i++;
		}
		return test;
	}
	public static void main(String[] args)
	{
		if (args.length==0)
		{
			System.out.println("Vous n'avez pas mis d'argument");
		}
		else
		{
			if (args.length>1)
			{
				System.out.println("Vous avez mis trop d'arguments");
			}
			else
			{
				String chaine[];
				chaine=new String [1];
				chaine[0]=args[0];
				boolean test;
				test=booleen(chaine);
				if (test==true)
					System.out.println("C'est un palyndrome");
				else
					System.out.println("Ce n'est pas un palyndrome");
			}
		}
	}
}