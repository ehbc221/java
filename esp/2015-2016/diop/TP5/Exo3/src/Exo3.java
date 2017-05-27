import java.util.Scanner;
public class Exo3
{
	public static void main(String[] args)
	{
		Scanner clavier = new Scanner (System.in);
		int compteur,i,j;
		char voyelle[] = {'a','e','i','o','u','y'};
		String chaine=new String();
		System.out.print("Saisissez votre chaine: ");
		chaine=clavier.nextLine();
		if (chaine.length()==0)
			System.out.println("Vous n'avez rien saisi");
		else
		{
			chaine=toLowerCase(chaine);
			for (i=0; i<6; i++)
			{
				compteur=0;
				for (j=0; j<chaine.length(); j++)
				{
					if (voyelle[i]==chaine.charAt(j))
						compteur++;
				}
				System.out.println(compteur + " fois la lettre " + voyelle[i]);
			}
		}
	}
}