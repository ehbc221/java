// Supposons que l'utilisateur passe le mot en argument dans la ligne de commande EX: java Pal1 "mot"
public class Pal1
{
	public static void main(String[] args)
	{
		String chaine=args[0];
		int l=chaine.length(), i=0, test=1;
		while ( (i<l) && (test==1) )
		{
			if ( chaine.charAt(i)!=chaine.charAt(l-i-1) )
			{
				test=0;
			}
			i++;
		}
		if (test==1)
			System.out.println("C'est un palyndrome");
		else
			System.out.println("Ce n'est pas un palyndrome");
	}
}