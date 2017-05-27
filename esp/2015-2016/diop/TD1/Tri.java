/*
import java.util.Scanner;
*/
public class Tri
{
	// ALGORITHME DU TRI EN BULLE
	public static void bubble(int [] t)
	{
		int l=t.length, i, j, temp;
		for (i=0; i<=l-1; i++)
		{
			for (j=1; j<=l-i-1; j++)
			{
				if (t[j]<t[j+1])
				{
					temp=t[j];
					t[j]=t[j+1];
					t[j+1]=temp;
				}
			}
		}
	}
	//FONCTION PRINCIPALE
	/*
	public static void main(String[] args)
	{
		Scanner clavier = new Scanner (System.in);
		int tab[], taille, i, j;
		
		do
		{
			System.out.print("Donner la taille du tableau: ");
			taille=clavier.nextInt();
		}
		while(taille<=1);
		for (i=0; i<taille; i++)
		{
			j=i+1;
			System.out.print("Donner l'element " + j + ": ");
			tab[i]=clavier.nextInt();
		}
		bubble(tab);
		System.out.println("Voici le tableau trie: ");
		for (i=0; i<taille; i++)
		{
			System.out.print(" " + tab[i] + " ");
		}
	}
	*/
}