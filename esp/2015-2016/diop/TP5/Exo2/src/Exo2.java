import java.util.Scanner;
public class Exo2
{
	public static void main(String[] args)
	{
		Scanner clavier = new Scanner (System.in);
		String chaine=new String();
		int i;
		do
		{
			System.out.print("Saisissez votre chaine: ");
			chaine=clavier.nextLine();
			if (chaine.length()==0)
				System.out.println("Vous n'avez rien saisi");
		}while (chaine.length()==0);
		System.out.print("Un caractere sur deux: ");
		if (chaine.length()==1)
			System.out.println(chaine);
		else
		{
			for (i=0; i<chaine.length(); i+=2)
				System.out.print(chaine.charAt(i));
		}
		if (chaine.length()==1)
			System.out.println("\nLe seul caractere saisi est: " + chaine);
		else
			System.out.print("\nLe premier et le dernier caractere sont: " + chaine.charAt(0) + " et " + chaine.charAt(chaine.length()-1));
	}
}